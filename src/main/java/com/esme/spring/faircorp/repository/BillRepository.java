package com.esme.spring.faircorp.repository;

import com.esme.spring.faircorp.model.Bill;
import com.esme.spring.faircorp.web.dto.BillDTO;
import com.esme.spring.faircorp.web.dto.BillListDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BillRepository extends JpaRepository<Bill, Integer> {
    @Query("select r.type as type , r.endTime as endTime, r.id as id, r.code as code, r.price as price, r.room.name as room, r.startTime as startTime" +
            ", r.status as status from Bill r where r.room.users.id = :id order by startTime desc")
    List<BillListDTO> getList2Bill(int id);

    @Query("select r.id as id, r.code as code, r.price as price, r.startTime as startTime, r.room.name as room, r.type as type, r.endTime as endTime" +
            ", r.status as status from Bill r where r.room.users.id = :id and r.status = :status order by startTime desc")
    List<BillListDTO> getListBill(int id, String status);

    @Query("select r.id as id, r.code as code, r.price as price, r.startTime as startTime, r.room.name as room, r.type as type, r.endTime as endTime" +
            ", r.note as note, r.status as status from Bill r where r.id = :id")
    Optional<BillDTO> getBill(int id);
}
