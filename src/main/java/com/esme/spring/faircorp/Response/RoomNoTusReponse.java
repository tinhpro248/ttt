package com.esme.spring.faircorp.Response;

public class RoomNoTusReponse {
    int id;
    String name;
    int price;
    int num;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public RoomNoTusReponse() {
    }

    public RoomNoTusReponse(int id, String name, int price, int num, byte[] image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.num = num;
        this.image = image;
    }
}
