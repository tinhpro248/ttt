package com.esme.spring.faircorp.Response;

import java.util.Date;

public class ProfileReponse {
    private int id;

    private String name;

    private boolean type;

    private String email;

    private String phone;

    private Date birthday;

    private String CCCD;

    private String room;

    private byte[] image;

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

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public ProfileReponse() {
    }

    public ProfileReponse(int id, String name, boolean type, String email, String phone, Date birthday, String CCCD, String room, byte[] image) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.CCCD = CCCD;
        this.room = room;
        this.image = image;
    }
}
