package com.esme.spring.faircorp.web.Request;

public class ServiceRequest {
    String detail;
    String name;
    int price;
    int roomId;

    public ServiceRequest(String detail, String name, int price, int roomId) {
        this.detail = detail;
        this.name = name;
        this.price = price;
        this.roomId = roomId;
    }

    public ServiceRequest() {
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
}
