package com.esme.spring.faircorp.web.Request;

import java.util.Date;

public interface IncidentRequest {
    int getId();
    int getRoom();
    String getType();
    Date getTime();
    String getNote();
    Byte[] getImage();
    String getStatus();
}
