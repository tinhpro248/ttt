package com.esme.spring.faircorp.web.dto;

import java.util.Date;

public interface TenantListDTO {
    int getId();
    String getName();
    String getPhone();
    Date getTime();
    byte[] getImage();

    String getRoom();
}
