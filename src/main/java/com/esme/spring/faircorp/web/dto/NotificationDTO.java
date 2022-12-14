package com.esme.spring.faircorp.web.dto;

import java.util.Date;

public class NotificationDTO {
    int id;
    String content;
    Date time;
    int type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public NotificationDTO() {
    }

    public NotificationDTO(int id, String content, Date time, int type) {
        this.id = id;
        this.content = content;
        this.time = time;
        this.type = type;
    }
}
