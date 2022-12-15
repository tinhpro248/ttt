package com.esme.spring.faircorp.web.Request;

import java.util.Date;

public class IncidentRequest {
    int id;
    int room;
    String type;
    String note;
    String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public IncidentRequest() {
    }

    public IncidentRequest(int id, int room, String type, String note, String image) {
        this.id = id;
        this.room = room;
        this.type = type;
        this.note = note;
        this.image = image;
    }
}
