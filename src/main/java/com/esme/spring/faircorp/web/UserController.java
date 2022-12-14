package com.esme.spring.faircorp.web;

import com.esme.spring.faircorp.Response.LoginReponse;
import com.esme.spring.faircorp.Response.ProfileReponse;
import com.esme.spring.faircorp.Service.UserService;
import com.esme.spring.faircorp.web.Request.UserRequest;
import com.esme.spring.faircorp.web.dto.LoginDTO;
import com.esme.spring.faircorp.web.dto.ProfileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Date;

/**
 * @author devmind
 */
@CrossOrigin
@RestController
@RequestMapping("api")
@Transactional
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("user/login")
    public LoginReponse login(@RequestHeader String userName, @RequestHeader String password){
        return userService.login(userName, password);
    }
    @PutMapping("user/register")
    public LoginReponse register(@RequestBody UserRequest user){
        return userService.register(user);
    }

    @GetMapping("user/profile")
    public ProfileReponse profile(@Param("id") int id){
        return userService.profile(id);
    }

    @PostMapping("user/edit")
    public ProfileDTO editProfile(@RequestBody ProfileDTO user){
        return user;
    }

    @PostMapping("user/edit-password")
    public boolean editPassword(@Param("id") int id, @RequestHeader String password, @RequestHeader String newPassword){
        return userService.editPassword(id, password, newPassword);
    }
}
