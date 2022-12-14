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

    @Column(name = "type")
    private int type;

    @Column(name = "detail")
    private String detail;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToMany
    @JoinTable(name = "room_service", joinColumns = {
            @JoinColumn(name = "room_id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "service_id")
    })
    private List<Room> roomList;

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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public Service() {
    }

    public Service(String name, int price, int type, String detail, Users users, List<Room> roomList) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.detail = detail;
        this.users = users;
        this.roomList = roomList;
    }
}
