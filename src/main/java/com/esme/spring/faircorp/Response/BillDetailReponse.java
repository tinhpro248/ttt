package com.esme.spring.faircorp.Response;

import java.util.Date;

public class BillDetailReponse {
    int id;
    String code;
    int type;
    int price;
    String note;
    int idRoom;
    Date startTime;
    Date endTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BillDetailReponse() {
    }

    public BillDetailReponse(int id, String code, int type, int price, String note, int idRoom, Date startTime, Date endTime) {
        this.id = id;
        this.code = code;
        this.type = type;
        this.price = price;
        this.note = note;
        this.idRoom = idRoom;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
