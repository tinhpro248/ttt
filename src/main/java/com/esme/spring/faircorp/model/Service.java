package com.esme.spring.faircorp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "detail")
    private String detail;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Room getRoomList() {
        return room;
    }

    public void setRoomList(Room room) {
        this.room = room;
    }

    public Service() {
    }

    public Service(String name, int price, String detail, Room room) {
        this.name = name;
        this.price = price;
        this.detail = detail;
        this.room = room;
    }
}
