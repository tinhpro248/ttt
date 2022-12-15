package com.esme.spring.faircorp.web;

//import com.esme.spring.faircorp.repository.RoomDao;
import com.esme.spring.faircorp.Service.NoService;
import com.esme.spring.faircorp.repository.NotificationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.*;

/**
 * @author devmind
 */
@CrossOrigin
@RestController
@RequestMapping("/api")
@Transactional
public class NotificationController {

    @Autowired
    NoService noService;
    @GetMapping("notification")
    public NotificationDTO notification(@Param("id") int id){
        return noService.getNotification(id);
    }

    @GetMapping("notification/list")
    public List<com.esme.spring.faircorp.repository.NotificationDTO> notificationList(@Param("id") int id){
        return noService.getAllNotify(id);
    }

}
