package com.esme.spring.faircorp.web.dto;

import java.util.Date;

public interface TenantDTO {
    int getId();
    String getName();
    String getEmail();
    String getPhone();
    String getCCCD();
    Date getBirthday();
    String getRoom();
    String getImage();
    Date getTime();
}
