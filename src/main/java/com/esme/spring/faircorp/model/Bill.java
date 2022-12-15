package com.esme.spring.faircorp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "type")
    private String type;

    @Column(name = "price")
    private int price;

    @Column(name = "note")
    private String note;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Bill() {
    }

    public Bill(String code, String type, int price, String note, Date startTime, Date endTime, String status, Room room) {
        this.code = code;
        this.type = type;
        this.price = price;
        this.note = note;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.room = room;
    }
}
