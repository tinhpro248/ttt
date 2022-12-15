package com.esme.spring.faircorp.web;

import com.esme.spring.faircorp.Response.*;
import com.esme.spring.faircorp.Service.ManageService;
import com.esme.spring.faircorp.web.Request.IncidentRequest;
import com.esme.spring.faircorp.web.Request.ServiceRequest;
import com.esme.spring.faircorp.web.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author devmind
 */
@CrossOrigin
@RestController
@RequestMapping("/api")
@Transactional
public class ManageController {

    @Autowired
    ManageService manageService;

    @GetMapping("room/{id}")
    public RoomInfoDetailDTO roomInfo(@PathVariable int id){
        return manageService.roomInfo(id);
    }

    @GetMapping("room")
    public List<RoomInfoDTO> roomList(@Param("id") int id){
        return manageService.roomList(id);
    }

    @GetMapping("tenant")
    public List<TenantListDTO> tenantsList(@Param("id") int id){
        return manageService.getTenantList(id);
    }

    @GetMapping("tenant/{id}")
    public TenantDTO tenant(@PathVariable int id){
        return manageService.getTenant(id);
    }

    @DeleteMapping("tenant/{id}")
    public boolean tenantDelete(@PathVariable int id){
        return manageService.deleteTenant(id);
    }

    @GetMapping("revenue")
    public List<RevenueListDTO> revenues(@Param("id") int id){
        return manageService.getRevenues(id);
    }

    @GetMapping("bill")
    public List<BillListDTO> bills(@Param("id") int id){
        return manageService.getList2Bill(id);
    }

    @GetMapping("revenue/all")
    public List<RevenueListDTO> revenueAll(@Param("id") int id){
        return manageService.getRevenuesAll(id);
    }

    @GetMapping("bill/all")
    public List<BillListDTO> billAll(@Param("userId") int id, @Param("status") int status){
        return manageService.getListAllBill(id, status);
    }

    @GetMapping("bill/all/{id}")
    public BillDTO billDetail(@PathVariable int id){
        return manageService.getBill(id);
    }

    @GetMapping("revenue/all/{id}")
    public RevenueDTO revenueDetail(@PathVariable int id){
        return manageService.getRevenue(id);
    }

    @DeleteMapping("revenue/all/{id}")
    public boolean revenueDelete(@PathVariable int id){
        return manageService.deleteRevenue(id);
    }

    @DeleteMapping("bill/all/{id}")
    public boolean billDelete(@PathVariable int id){
        return manageService.deleteBill(id);
    }

    @PostMapping("bill/all/{id}")
    public BillDetailReponse editBill(@PathVariable int id, @RequestBody BillDetailReponse bill){
        return manageService.editBill(bill);
    }

    @PutMapping("bill/all")
    public BillDetailReponse addBill(@RequestBody BillDetailReponse bill){
        return manageService.addBill(bill);
    }

    @PostMapping("bill/all/{id}/pay")
    public boolean payBill(@PathVariable int id){
        return manageService.payBill(id);
    }

    @GetMapping("incident")
    public List<IncidentListDTO> incidents(@Param("id") int id, @Param("status") int status){
        return manageService.getListIncident(id, status);
    }

    @GetMapping("incident/{id}")
    public IncidentDTO incidentDetail(@PathVariable int id){
        return manageService.getIncident(id);
    }

    @PutMapping("incident")
    public IncidentRequest addIncident(@RequestBody IncidentRequest incidentDTO){
        return manageService.addIncident(incidentDTO);
    }

    @PostMapping("incident/{id}")
    public IncidentDetailReponse incidentEdit(@PathVariable int id, @RequestBody IncidentDetailReponse incident){
        return manageService.editIncident(incident);
    }

    @GetMapping("room/name")
    public List<RoomNameDTO> roomName(@Param("id") int id){
        return manageService.getRoomName(id);
    }

    @GetMapping("service")
    public List<ServiceListDTO> services(@Param("id") int id){
        return manageService.getServiceList(id);
    }



    @GetMapping("service/{id}")
    public SeviceDetailDTO serviceDetail(@PathVariable int id){
        return manageService.getService(id);
    }

    @PutMapping("service")
    public ServiceRequest serviceEdit(@RequestBody ServiceRequest service){
        return manageService.addService(service);
    }

    @DeleteMapping("service/{id}")
    public boolean serviceDelete(@PathVariable int id){
        return manageService.deleteService(id);
    }

    @GetMapping("room/tus")
    public List<RoomTusReponse> roomTusList(@Param("id") int id){
        return manageService.getTusList(id);
    }

    @GetMapping("room/tus/no")
    public List<RoomNoTusReponse> roomNoTusList(@Param("id") int id){
        return manageService.getRoomNoTus(id);
    }

    @GetMapping("room/tus/{id}")
    public RoomTusDetailReponse roomTusDetailReponse(@PathVariable int id){
        return manageService.getTus(id);
    }

    @PostMapping("room/tus/no/{id}")
    public RoomTusDetailReponse roomTusAdd(@PathVariable int id, @RequestBody String note){
        return manageService.addTus(id, note);
    }
}
