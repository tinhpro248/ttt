package com.esme.spring.faircorp.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tus")
public class Tus {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "time")
    private Date time;

    @Column(name = "note")
    private String note;

    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToMany
    @JoinTable(name = "user_tus", joinColumns = {
            @JoinColumn(name = "user_id")
    },
    inverseJoinColumns = {
            @JoinColumn(name = "tus_id")
    })
    private List<Users> usersSave;

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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List<Users> getUsersSave() {
        return usersSave;
    }

    public void setUsersSave(List<Users> usersSave) {
        this.usersSave = usersSave;
    }

    public Tus() {
    }

    public Tus(Date time, String note, Room room, List<Users> usersSave) {
        this.time = time;
        this.note = note;
        this.room = room;
        this.usersSave = usersSave;
    }
}
