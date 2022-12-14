package com.esme.spring.faircorp.Service;

import com.esme.spring.faircorp.Response.*;
import com.esme.spring.faircorp.model.*;
import com.esme.spring.faircorp.repository.*;
import com.esme.spring.faircorp.web.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ManageService {

    @Autowired
    BillRepository billRepository;
    @Autowired
    IncidentRepository incidentRepository;
    @Autowired
    InfoRepository infoRepository;
    @Autowired
    RevenueRepository revenueRepository;
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    ServiceRepository serviceRepository;
    @Autowired
    TenantsRepository tenantsRepository;
    @Autowired
    TusRepository tusRepository;
    @Autowired
    UserRepository userRepository;

    public RoomInfoDTO roomInfo(int id){
        return roomRepository.getRoomById(id);
    }

    public List<RoomInfoDTO> roomList(int id){
        return roomRepository.getRoomByUserId(id);
    }

    public List<TenantListDTO> getTenantList(int id){
        return tenantsRepository.getAllTenantByUserId(id);
    }

    public TenantDTO getTenant(int id){
        Optional<TenantDTO> t = tenantsRepository.getTenant(id);
        return t.orElse(null);
    }

    public boolean deleteTenant(int id){
        Optional<Tenants> t = tenantsRepository.findById(id);

        if(t.isPresent()){
            tenantsRepository.delete(t.get());
            return true;
        }
        else{
            return false;
        }
    }

    public List<RevenueListDTO> getRevenues(int id){
        return revenueRepository.getList2Revenue(id);
    }

    public List<RevenueListDTO> getRevenuesAll(int id){
        return revenueRepository.getListRevenue(id);
    }

    public RevenueDTO getRevenue(int id){
        Optional<RevenueDTO> r =revenueRepository.getRevenue(id);
        return r.orElse(null);
    }

    public boolean deleteRevenue(int id){
        Optional<Revenue> r = revenueRepository.findById(id);

        if(r.isPresent()){
            revenueRepository.delete(r.get());
            return true;
        }
        else{
            return false;
        }
    }

    public List<BillListDTO> getList2Bill(int id){
        return billRepository.getList2Bill(id);
    }

    public List<BillListDTO> getListAllBill(int id){
        return billRepository.getListBill(id);
    }

    public BillDTO getBill(int id){
        Optional<BillDTO> b = billRepository.getBill(id);
        return b.orElse(null);
    }

    public boolean deleteBill(int id){
        Optional<Bill> b = billRepository.findById(id);
        if(b.isPresent()){
            billRepository.delete(b.get());
            return true;
        }
        else{
            return false;
        }
    }

    public List<IncidentListDTO> getListIncident(int id){
        Optional<Users> uO = userRepository.findById(id);
        if(uO.isPresent()){
            Users u = uO.get();
            if(u.isType()){
                return incidentRepository.getListIncident(id);
            }
            else {
                if(u.getTenants() != null){
                    if(u.getTenants().getRoom() != null){
                        return incidentRepository.getListIncidentTenant(u.getTenants().getRoom().getId());
                    }
                }
                return Collections.emptyList();
            }
        }
        else {
            return Collections.emptyList();
        }
    }

    public IncidentDTO getIncident(int id){
        Optional<IncidentDTO> i = incidentRepository.getIncident(id);
        return i.orElse(null);
    }

    public List<RoomNameDTO> getRoomName(int id){
        return roomRepository.getRoomName(id);
    }

    public List<ServiceListDTO> getServiceList(int id){
        return serviceRepository.getListService(id);
    }

    public List<ServiceListReponse> getServiceListRoom(int id){
        Optional<Room> r = roomRepository.findById(id);
        if(r.isPresent()){
            if(!r.get().getServiceList().isEmpty()){
                List<ServiceListReponse> ls = new java.util.ArrayList<>(Collections.emptyList());
                for(com.esme.spring.faircorp.model.Service item : r.get().getServiceList()){
                    ls.add(new ServiceListReponse(item.getId(), item.getName(), item.getPrice(), item.getType()));
                }
                return ls;
            }
            return Collections.emptyList();
        }
        return Collections.emptyList();
    }

    public List<RoomTusReponse> getTusList(int id){
        Optional<Info> iO = infoRepository.getIn(id);
        if(iO.isPresent()){
            Info i = iO.get();
            List<RoomTusReponse> ls = new java.util.ArrayList<>(Collections.emptyList());
            List<Room> roomList = roomRepository.getRoomByUser(id);
            for( Room item : roomList){
                if(item.getTus() != null){
                    ls.add(new RoomTusReponse(item.getTus().getId(), i.getName(), item.getNumberOfTenants(), item.getPrice(), i.getAddress(), item.getImage()));
                }
            }
            return ls;
        }
        return Collections.emptyList();
    }

    public List<RoomNoTusReponse> getRoomNoTus(int id){
        List<RoomNoTusReponse> ls = new java.util.ArrayList<>(Collections.emptyList());
        List<Room> roomList = roomRepository.getRoomByUser(id);
        for( Room item : roomList){
            if(item.getTus() == null){
                ls.add(new RoomNoTusReponse(item.getId(), item.getName(), item.getPrice(), item.getNumberOfTenants(), item.getImage()));
            }
        }
        return ls;
    }

    public RoomTusDetailReponse getTus(int id){
        Optional<Tus> tusOptional = tusRepository.findById(id);
        if(tusOptional.isPresent()){
            Tus tus = tusOptional.get();
            Room room = tus.getRoom();
            Users users = room.getUsers();
            Info info = users.getInfo();
            return new RoomTusDetailReponse(tus.getId(), info.getName(), room.getPrice(), room.getImage(), info.getAddress(), tus.getTime(), users.getName(), users.getPhoneNum(), users.getImage(), info.getVote(), tus.getNote());
        }
        else {
            return null;
        }
    }

    public BillDetailReponse editBill(BillDetailReponse bill){
        Optional<Bill> bO = billRepository.findById(bill.getId());
        Optional<Room> rO = roomRepository.findById(bill.getIdRoom());
        if(bO.isPresent()){
            Bill b = bO.get();
            b.setCode(bill.getCode());
            rO.ifPresent(b::setRoom);
            b.setType(bill.getType());
            b.setStartTime(bill.getStartTime());
            b.setEndTime(bill.getEndTime());
            b.setPrice(bill.getPrice());
            b.setNote(bill.getNote());
            billRepository.save(b);
            return bill;
        }
        else{
            return null;
        }
    }

    public BillDetailReponse addBill(BillDetailReponse bill){
        Optional<Bill> bO = billRepository.findById(bill.getId());
        Optional<Room> rO = roomRepository.findById(bill.getIdRoom());
        if(bO.isPresent()){
            return null;
        }
        else{
            Bill newB = new Bill(bill.getCode(), bill.getType(), bill.getPrice(), bill.getNote(), bill.getStartTime(), bill.getEndTime(), 0,rO.orElse(null));
            billRepository.save(newB);
            return bill;
        }
    }

    public boolean payBill(int id){
        Optional<Bill> bO = billRepository.findById(id);
        if(bO.isPresent()){
            Bill b = bO.get();
            b.setStatus(1);
            Revenue newR = new Revenue(b.getCode(), b.getType(), true, b.getPrice(), b.getNote(), new Date(), b.getRoom().getUsers(), b.getRoom(), null);
            revenueRepository.save(newR);
            return true;
        }
        else {
            return false;
        }
    }

    public IncidentDetailReponse editIncident(IncidentDetailReponse incident){
        Optional<Incident> iO = incidentRepository.findById(incident.getId());
        if(iO.isPresent()){
            Incident i = iO.get();
            i.setType(incident.getType());
            Optional<Room> rO = roomRepository.findById(incident.getRoomId());
            rO.ifPresent(i::setRoom);
            i.setNote(incident.getNote());
            i.setImage(incident.getImage());
            incidentRepository.save(i);
            return incident;
        }
        return null;
    }

    public RoomTusDetailReponse addTus(int id, String note){
        Optional<Room> rO = roomRepository.findById(id);
        if(rO.isPresent()) {
            Tus tus = new Tus(new Date(), note, rO.get(), null);
            tusRepository.save(tus);
            return getTus(id);
        }
        else{
            return null;
        }
    }

}
