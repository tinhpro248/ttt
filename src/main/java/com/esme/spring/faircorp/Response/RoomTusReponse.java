package com.esme.spring.faircorp.Response;

public class RoomTusReponse {
    int id;
    String name;
    int num;
    int price;
    String address;
    byte[] image;

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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public RoomTusReponse() {
    }

    public RoomTusReponse(int id, String name, int num, int price, String address, byte[] image) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.price = price;
        this.address = address;
        this.image = image;
    }
}
