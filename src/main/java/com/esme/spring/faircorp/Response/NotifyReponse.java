package com.esme.spring.faircorp.Response;


import java.util.Date;

public class NotifyReponse {
    private int id;
    private String content;
    private Date time;
    private int type;

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

    public NotifyReponse() {
    }

    public NotifyReponse(int id, String content, Date time, int type) {
        this.id = id;
        this.content = content;
        this.time = time;
        this.type = type;
    }
}
