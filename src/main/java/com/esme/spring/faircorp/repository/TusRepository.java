package com.esme.spring.faircorp.repository;

import com.esme.spring.faircorp.model.Tus;
import com.esme.spring.faircorp.web.dto.TusDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TusRepository extends JpaRepository<Tus, Integer> {

    @Query("select t.id as id, t.room.users.info.name as name, t.room.numberOfTenants as num, t.room.price as price, t.room.users.info.address as address, t.room.image as image from Tus t ")
    List<TusDTO> getAllTus();
}
