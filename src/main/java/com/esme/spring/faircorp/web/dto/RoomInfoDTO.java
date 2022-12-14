package com.esme.spring.faircorp.web.dto;

import java.util.Date;

public interface RoomInfoDTO {
    public int getId();
    public String getName();
    public String getArea();
    public String getPrice();
    public String getNumberOfTenants();
    public Date getRentFrom();
    public String getSex();
}
