package com.esme.spring.faircorp.Response;

public class ServiceListReponse {
    int id;
    String name;
    int price;
    int type;

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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public ServiceListReponse() {
    }

    public ServiceListReponse(int id, String name, int price, int type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }
}
