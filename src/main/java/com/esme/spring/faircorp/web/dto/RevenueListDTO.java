package com.esme.spring.faircorp.web.dto;

import java.util.Date;

public interface RevenueListDTO {
    int getId();
    String getCode();
    String getType();
    int getPrice();
    String getRoom();
    String getUser();
    Date getTime();

    String getGroup();
}
