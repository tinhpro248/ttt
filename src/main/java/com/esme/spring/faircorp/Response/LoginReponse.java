package com.esme.spring.faircorp.Response;

public class LoginReponse {
    private int id;
    private String name;
    private boolean type;
    private String image;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LoginReponse() {
    }

    public LoginReponse(int id, String name, boolean type, String image) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.image = image;
    }
}
