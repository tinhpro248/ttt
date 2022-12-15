package com.esme.spring.faircorp.web.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RoomInfoDTO {
    int id;
    String name;
    String area;
    int price;
    int numberOfTenants;
    Date rentFrom;
    String sex;
    int numRents;

    public RoomInfoDTO() {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getNumRents() {
        return numRents;
    }

    public void setNumRents(int numRents) {
        this.numRents = numRents;
    }

    public RoomInfoDTO(int id, String name, String area, int price, int numberOfTenants, Date rentFrom, String sex, int numRents) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.price = price;
        this.numberOfTenants = numberOfTenants;
        this.rentFrom = rentFrom;
        this.sex = sex;
        this.numRents = numRents;
    }
}
