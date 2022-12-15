package com.esme.spring.faircorp.web.Request;

import java.util.Date;
import java.util.List;

public class RoomDetailRequest {
    String name;
    String area;
    int price;
    int numberOfTenants;

    byte[] image;

    String sex;

    int userId;

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfTenants() {
        return numberOfTenants;
    }

    public void setNumberOfTenants(int numberOfTenants) {
        this.numberOfTenants = numberOfTenants;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public RoomDetailRequest() {
    }

    public RoomDetailRequest(String name, String area, int price, int numberOfTenants, byte[] image, String sex, int userId) {
        this.name = name;
        this.area = area;
        this.price = price;
        this.numberOfTenants = numberOfTenants;
        this.image = image;
        this.sex = sex;
        this.userId = userId;
    }
}
