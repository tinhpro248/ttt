package com.esme.spring.faircorp.repository;

import com.esme.spring.faircorp.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,Integer> {

    @Query(value = "SELECT * FROM users u WHERE u.username = ?1 and u.password = ?2", nativeQuery = true)
    Optional<Users> login(String username, String password);

    @Query(value = "SELECT CASE WHEN COUNT(u) < 1 THEN true ELSE false END FROM users u WHERE u.username = ?1", nativeQuery = true)
    boolean registerCheck(String username);

    @Query(value = "SELECT * FROM users u WHERE u.id = ?1", nativeQuery = true)
    Optional<Users> profile(int id);
}
