package com.esme.spring.faircorp.repository;

import com.esme.spring.faircorp.model.Revenue;
import com.esme.spring.faircorp.web.dto.RevenueDTO;
import com.esme.spring.faircorp.web.dto.RevenueListDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface RevenueRepository extends JpaRepository<Revenue, Integer> {
    @Query("select r.id as id, r.code as code, r.price as price, r.users.name as user, r.room.name as room, r.type as type, r.time as time" +
            ",r.groups as group from Revenue r where r.users.id = :id order by time desc")
    List<RevenueListDTO> getList2Revenue(int id);

    @Query("select r.id as id, r.code as code, r.price as price, r.users.name as user, r.room.name as room, r.type as type, r.time as time" +
            ",r.groups as group from Revenue r where r.room.id = :id order by time desc")
    List<RevenueListDTO> getListRevenueRoom(int id);


    @Query("select r.id as id, r.code as code, r.price as price, r.users.name as user, r.room.name as room, r.type as type, r.time as time" +
            ",r.groups as group from Revenue r where r.users.id = :id order by time desc")
    List<RevenueListDTO> getListRevenue(int id);

    @Query("select r.id as id, r.code as code, r.price as price, r.users.name as user, r.room.name as room, r.type as type, r.groups as group" +
            " from Revenue r where r.id = :id")
    Optional<RevenueDTO> getRevenue(int id);
}
