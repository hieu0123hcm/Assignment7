package com.bienthaikieusa.chitchat.repository;

import com.bienthaikieusa.chitchat.model.Notification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends CrudRepository<Notification, Long> {
    @Query("SELECT s FROM Notification s WHERE LOWER(s.sendid) = LOWER(:sendid) ORDER BY s.created_on DESC")
    public List<Notification> findBySendID(@Param("sendid") String sendID);

    @Query("SELECT s FROM Notification s where s.isAdminRead = false ORDER BY s.created_on DESC")
    public List<Notification> findByNotRead();
}
