package com.esme.spring.faircorp.web.Request;

import java.util.Date;
import java.util.List;

public class RoomDetailRequest {
    int id;
    String name;
    String area;
    int price;
    int numberOfTenants;
    Date rentFrom;
    int numRents;

    Byte[] image;

    String sex;

    int userId;

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

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

    public Date getRentFrom() {
        return rentFrom;
    }

    public void setRentFrom(Date rentFrom) {
        this.rentFrom = rentFrom;
    }

    public int getNumRents() {
        return numRents;
    }

    public void setNumRents(int numRents) {
        this.numRents = numRents;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public RoomDetailRequest() {
    }

    public RoomDetailRequest(int id, String name, String area, int price, int numberOfTenants, Date rentFrom, int numRents, Byte[] image, String sex, int userId) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.price = price;
        this.numberOfTenants = numberOfTenants;
        this.rentFrom = rentFrom;
        this.numRents = numRents;
        this.image = image;
        this.sex = sex;
        this.userId = userId;
    }
}
