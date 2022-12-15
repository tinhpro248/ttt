package com.esme.spring.faircorp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "revenue")
public class Revenue {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "type")
    private String type;

    @Column(name = "groups")
    private String groups;

    @Column(name = "price")
    private int price;

    @Column(name = "note")
    private String note;

    @Column(name = "time")
    private Date time;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Users tenant;

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

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Users getTenant() {
        return tenant;
    }

    public void setTenant(Users tenant) {
        this.tenant = tenant;
    }

    public Revenue() {
    }

    public Revenue(String code, String type, String groups, int price, String note, Date time, Users users, Room room, Users tenant) {
        this.code = code;
        this.type = type;
        this.groups = groups;
        this.price = price;
        this.note = note;
        this.time = time;
        this.users = users;
        this.room = room;
        this.tenant = tenant;
    }
}
