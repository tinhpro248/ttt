package com.esme.spring.faircorp.repository;

import com.esme.spring.faircorp.model.Tenants;
import com.esme.spring.faircorp.web.dto.TenantDTO;
import com.esme.spring.faircorp.web.dto.TenantListDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TenantsRepository extends JpaRepository<Tenants, Integer> {
    @Query("select t.id as id, t.time as time, t.usersParent.name as name, t.usersParent.phoneNum as phone, t.users.image as image from " +
            "Tenants t where t.users.id = :userId")
    List<TenantListDTO> getAllTenantByUserId(int userId);

    @Query("select t.id as id, t.time as time, t.usersParent.name as name, t.usersParent.phoneNum as phone, t.users.image as image from " +
            "Tenants t where t.room.id = :id")
    List<TenantListDTO> getAllTenantByRoom(int id);

    @Query("select t.id as id, t.usersParent.name as name, t.usersParent.phoneNum as phone, t.usersParent.email as email," +
            "t.usersParent.CCCD as cCCD, t.usersParent.birthday as birthday, t.usersParent.image as image, t.room.name as room, " +
            "t.time as time from Tenants t where t.id = :id")
    Optional<TenantDTO> getTenant(int id);
}
