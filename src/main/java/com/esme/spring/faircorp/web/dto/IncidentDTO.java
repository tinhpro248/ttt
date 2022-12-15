package com.esme.spring.faircorp.web.dto;

import java.util.Date;

public interface IncidentDTO {
    int getId();
    String getRoom();
    String getType();
    Date getTime();
    String getNote();
    Byte[] getImage();
    String getStatus();
}
