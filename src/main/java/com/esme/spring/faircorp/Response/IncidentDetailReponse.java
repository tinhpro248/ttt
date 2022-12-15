package com.esme.spring.faircorp.Response;

public class IncidentDetailReponse {
    int id;
    String type;
    int roomId;
    String note;
    String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
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

    public IncidentDetailReponse() {
    }

    public IncidentDetailReponse(int id, String type, int roomId, String note, String image) {
        this.id = id;
        this.type = type;
        this.roomId = roomId;
        this.note = note;
        this.image = image;
    }
}
