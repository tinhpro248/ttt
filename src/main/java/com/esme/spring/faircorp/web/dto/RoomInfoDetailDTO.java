package com.esme.spring.faircorp.web.dto;

import java.util.Date;
import java.util.List;

public class RoomInfoDetailDTO {
    int id;
    String name;
    String area;
    int price;
    int numberOfTenants;
    Date rentFrom;
    int numRents;

    byte[] image;

    String sex;
    List<ServiceI> serviceIList;

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

    public List<ServiceI> getServiceIList() {
        return serviceIList;
    }

    public void setServiceIList(List<ServiceI> serviceIList) {
        this.serviceIList = serviceIList;
    }

    public RoomInfoDetailDTO() {
    }

    public RoomInfoDetailDTO(int id, String name, String area, int price, int numberOfTenants, Date rentFrom, int numRents, byte[] image, String sex, List<ServiceI> serviceIList) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.price = price;
        this.numberOfTenants = numberOfTenants;
        this.rentFrom = rentFrom;
        this.numRents = numRents;
        this.image = image;
        this.sex = sex;
        this.serviceIList = serviceIList;
    }
}
