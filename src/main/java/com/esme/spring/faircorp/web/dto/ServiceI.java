package com.esme.spring.faircorp.web.dto;

public class ServiceI {
    String name;
    int price;

    public ServiceI() {
    }

    public ServiceI(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName(){
        return this.name;
    };
    public int getPrice(){
        return this.price;
    };
}
