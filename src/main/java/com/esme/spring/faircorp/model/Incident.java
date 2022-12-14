package com.esme.spring.faircorp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "incident")
public class Incident {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "time")
    private Date time;

    @Column(name = "note")
    private String note;

    @Column(name = "type")
    private String type;

    @Column(name = "image")
    @Lob
    private byte[] image;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
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

    public Incident() {
    }

    public Incident(Date time, String note, String type, byte[] image, String status, Room room) {
        this.time = time;
        this.note = note;
        this.type = type;
        this.image = image;
        this.room = room;
        this.status = status;
    }
}
