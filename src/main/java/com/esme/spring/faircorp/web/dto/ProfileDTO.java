package com.esme.spring.faircorp.web.dto;

import java.util.Date;

public class ProfileDTO {
    private int id;

    private String name;

    private boolean type;

    private String email;

    private String phone;

    private Date birthday;

    private String CCCD;

    private Byte[] image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public ProfileDTO() {
    }

    public ProfileDTO(int id, String name, boolean type, String email, String phone, Date birthday, String CCCD, Byte[] image) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.CCCD = CCCD;
        this.image = image;
    }
}