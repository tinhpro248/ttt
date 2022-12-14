package com.esme.spring.faircorp.Service;

import com.esme.spring.faircorp.repository.NotificationDTO;
import com.esme.spring.faircorp.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoService {

    @Autowired
    NotificationRepository notificationRepository;

    public NotificationDTO getNotification(int id) {
        return notificationRepository.getAll(id).get(0);
    }

    public List<NotificationDTO> getAllNotify(int id){
        return notificationRepository.getAll(id);
    }


}
