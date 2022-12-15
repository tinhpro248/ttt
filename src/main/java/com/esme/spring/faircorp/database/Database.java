package com.esme.spring.faircorp.database;

import com.esme.spring.faircorp.model.Incident;
import com.esme.spring.faircorp.model.Users;
import com.esme.spring.faircorp.repository.IncidentRepository;
import com.esme.spring.faircorp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.Optional;

@Configuration
public class Database {
    @Autowired
    UserRepository userRepository;
    @Bean
    CommandLineRunner initDatabase(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
            }
        };
    }
}

