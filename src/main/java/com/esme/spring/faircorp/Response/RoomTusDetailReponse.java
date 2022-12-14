package com.esme.spring.faircorp.Response;


import java.util.Date;

public class RoomTusDetailReponse {
    int id;
    String name;
    int price;
    Byte[] image;
    String address;
    Date time;
    String userName;
    String phone;
    Byte[] userImage;
    float vote;
    String note;

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Byte[] getUserImage() {
        return userImage;
    }

    public void setUserImage(Byte[] userImage) {
        this.userImage = userImage;
    }

    public float getVote() {
        return vote;
    }

    public void setVote(float vote) {
        this.vote = vote;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public RoomTusDetailReponse() {
    }

    public RoomTusDetailReponse(int id, String name, int price, Byte[] image, String address, Date time, String userName, String phone, Byte[] userImage, float vote, String note) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.address = address;
        this.time = time;
        this.userName = userName;
        this.phone = phone;
        this.userImage = userImage;
        this.vote = vote;
        this.note = note;
    }
}
