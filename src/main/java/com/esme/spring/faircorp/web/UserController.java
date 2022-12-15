package com.esme.spring.faircorp.web;

import com.esme.spring.faircorp.Response.LoginReponse;
import com.esme.spring.faircorp.Response.ProfileReponse;
import com.esme.spring.faircorp.Service.UserService;
import com.esme.spring.faircorp.web.Request.UserRequest;
import com.esme.spring.faircorp.web.dto.LoginDTO;
import com.esme.spring.faircorp.web.dto.ProfileDTO;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.Random;

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
        return userService.userEdit(user);
    }

    @PostMapping("user/edit-password")
    public boolean editPassword(@Param("id") int id, @RequestHeader String password, @RequestHeader String newPassword){
        return userService.editPassword(id, password, newPassword);
    }

    @PostMapping("user/password")
    public String password(@Param("username") String username) {
        return userService.password(username);
    }

    @GetMapping(value = "/sendSMS")
    public String sendSMS(@Param("phone") String phone) {

        Twilio.init("ACe142116383267bf8f8e921941d7b62e0", "fa1cf1ffd0132b3019d6dd22fe0dd266");
        Random rand = new Random();

        int randomNum = rand.nextInt((999999 - 100000) + 1) + 1000000;
        Message.creator(new PhoneNumber(phone),
                new PhoneNumber("+15627847500"), "Verify code:" + String.valueOf(randomNum)).create();

        return String.valueOf(randomNum);
    }

    @GetMapping("aa")
    public boolean aaa(@Param("id") int id, @Param("ss") String ss){
        return userService.s(ss, id);
    }
}
