package com.esme.spring.faircorp.Service;

import com.esme.spring.faircorp.Response.LoginReponse;
import com.esme.spring.faircorp.Response.ProfileReponse;
import com.esme.spring.faircorp.model.Users;
import com.esme.spring.faircorp.repository.UserRepository;
import com.esme.spring.faircorp.web.Request.UserRequest;
import com.esme.spring.faircorp.web.dto.ProfileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public LoginReponse login(String username, String password){
        Optional<Users> u = userRepository.login(username, password);
        return u.map(users -> new LoginReponse(users.getId(), users.getName(), users.isType(), users.getImage())).orElse(null);
    }

    public LoginReponse register(UserRequest user){
        if(userRepository.registerCheck(user.getUsername()).isPresent()){
            return null;
        }
        else{
            Users newUser = new Users(user.getUsername(), user.getPassword(), user.getName() ,user.getEmail(), user.getPhone(), user.isType());
            Users u = userRepository.save(newUser);
            return new LoginReponse(u.getId(), u.getName(), u.isType(), u.getImage());
        }
    }

    public ProfileReponse profile(int id){
        Optional<Users> u = userRepository.profile(id);
        if(u.isPresent()){
            String room = "";
            if(u.get().getTenants() != null) {
                if(u.get().getTenants().getRoom() != null){
                    room = u.get().getTenants().getRoom().getName();
                }
            }
            return new ProfileReponse(u.get().getId(), u.get().getName(), u.get().isType(), u.get().getEmail(), u.get().getPhoneNum(), u.get().getBirthday(), u.get().getCCCD(), room, u.get().getImage());
        }
        else{
            return null;
        }
    }

    public ProfileDTO userEdit(ProfileDTO user){
        Optional<Users> u = userRepository.profile(user.getId());
        if(u.isPresent()){
            Users newUser = u.get();
            newUser.setName(user.getName());
            newUser.setType(user.isType());
            newUser.setEmail(user.getEmail());
            newUser.setPhoneNum(user.getPhone());
            newUser.setBirthday(user.getBirthday());
            newUser.setCCCD(user.getCCCD());
            newUser.setImage(user.getImage());
            userRepository.save(newUser);
            return user;
        }
        else{return null;}
    }

    public boolean editPassword(int id, String password, String newPassword){
        Optional<Users> u = userRepository.profile(id);
        if(u.isPresent() && Objects.equals(u.get().getPassword(), password)){
            Users users = u.get();
            users.setPassword(newPassword);
            userRepository.save(users);
            return true;
        }
        else{return false;}
    }

    public String password(String username){
        Optional<String> uO = userRepository.getPassword(username);
        return uO.orElse(null);
    }

}
