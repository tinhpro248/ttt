package com.esme.spring.faircorp.web.dto;

import java.util.Date;

public interface BillDTO {
    int getId();
    String getCode();
    int getType();
    int getPrice();
    String getRoom();
    Date getStartTime();
    Date getEndTime();
    String getNote();
}
