package com.esme.spring.faircorp.repository;

import com.esme.spring.faircorp.model.Service;
import com.esme.spring.faircorp.web.dto.ServiceListDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
    @Query("select s.id as id, s.name as name, s.price as price from Service s where s.room.id = :id")
    List<ServiceListDTO> getListService(int id);

}
