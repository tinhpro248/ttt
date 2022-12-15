package com.esme.spring.faircorp.Response;

public class LoginReponse {
    private int id;
    private String name;
    private boolean type;
    private byte[] image;

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

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public LoginReponse() {
    }

    public LoginReponse(int id, String name, boolean type, byte[] image) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.image = image;
    }
}
