package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.Notification;

import java.util.List;
import java.util.Optional;

public interface NotificationService {
    List<Notification> findAll();
    Optional<Notification> findNoticeById(Long noticeID);
    List<Notification> findBySendID(String sendID);
    void createNotification(Notification notification);
    List<Notification> findByNotRead();
}
