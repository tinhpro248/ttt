package com.esme.spring.faircorp.repository;

import com.esme.spring.faircorp.model.Room;
import com.esme.spring.faircorp.web.dto.RoomInfoDTO;
import com.esme.spring.faircorp.web.dto.RoomNameDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Integer> {

    @Query(value = "SELECT r.id as id, r.name as name, r.area as area, r.price as price, r.number_of_tenants as numberOfTenants, r.rent_from as rentFrom, r.sex as sex FROM room r WHERE r.id = ?1", nativeQuery = true)
    RoomInfoDTO getRoomById(int id);

    @Query(value = "SELECT r.id as id, r.name as name, r.area as area, r.price as price, r.number_of_tenants as numberOfTenants, r.rent_from as rentFrom, r.sex as sex FROM room r WHERE r.users_id = ?1", nativeQuery = true)
    List<RoomInfoDTO> getRoomByUserId(int id);

    @Query("select r.name as name, r.id as id from Room r where r.users.id = :id")
    List<RoomNameDTO> getRoomName(int id);

    @Query("select r from Room r where r.users.id = :id")
    List<Room> getRoomByUser(int id);
}
