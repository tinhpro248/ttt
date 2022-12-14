package com.esme.spring.faircorp.web;

//import com.esme.spring.faircorp.repository.RoomDao;
import com.esme.spring.faircorp.web.dto.NotificationDTO;
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

//    @Autowired
//    NoService noService;
    @GetMapping("notification")
    public NotificationDTO notification(@Param("id") int id){
        return new NotificationDTO(1, "Phòng P001 đã thanh toán tiền phòng tháng 8", new Date(), 0);
    }

    @GetMapping("notification/list")
    public ArrayList<NotificationDTO> notificationList(@Param("id") int id){
        ArrayList<NotificationDTO> arrayList = new ArrayList<NotificationDTO>();
        arrayList.add(new NotificationDTO(1, "Phòng P001 đã thanh toán tiền phòng tháng 8", new Date(), 0));
        return arrayList;
    }

}
