package com.esme.spring.faircorp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tenants")
public class Tenants {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "time")
    private Date time;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    @OneToOne
    @JoinColumn(name = "tenant_id")
    private Users usersParent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Users getUsersParent() {
        return usersParent;
    }

    public void setUsersParent(Users usersParent) {
        this.usersParent = usersParent;
    }

    public Tenants() {
    }

    public Tenants(Date time, Room room, Users users, Users usersParent) {
        this.time = time;
        this.room = room;
        this.users = users;
        this.usersParent = usersParent;
    }
}
