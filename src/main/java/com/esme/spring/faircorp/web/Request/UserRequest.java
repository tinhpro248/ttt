package com.esme.spring.faircorp.web.Request;

public class UserRequest {
    String username;

    String name;
    String password;
    String phone;
    String email;
    boolean type;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public UserRequest() {
    }

    public UserRequest(String username, String name, String password, String phone, String email, boolean type) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.type = type;
    }
}
