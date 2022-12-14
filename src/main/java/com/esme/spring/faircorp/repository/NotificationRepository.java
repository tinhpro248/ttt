package com.esme.spring.faircorp.repository;
import com.esme.spring.faircorp.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification,Integer> {

        @Query(value = "SELECT * FROM notification n WHERE n.users_id = ?1 ORDER BY time DESC", nativeQuery = true)
        List<Notification> findNo(int userId);

        @Query(value = "SELECT n.id as id, n.content as content, n.time as time, n.type as type FROM notification n WHERE n.users_id = ?1 ORDER BY time DESC", nativeQuery = true)
        List<NotificationDTO> getAll(int id);
}
