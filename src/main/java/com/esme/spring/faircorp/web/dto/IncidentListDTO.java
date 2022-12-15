package com.esme.spring.faircorp.web.dto;

import java.util.Date;

public interface IncidentListDTO {
    int getId();
    String getRoom();
    String getType();
    Date getTime();
    byte[] getImage();

    String getStatus();
}
