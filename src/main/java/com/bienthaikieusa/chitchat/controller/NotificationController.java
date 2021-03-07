package com.bienthaikieusa.chitchat.controller;

import com.bienthaikieusa.chitchat.model.Message;
import com.bienthaikieusa.chitchat.model.Notification;
import com.bienthaikieusa.chitchat.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @RequestMapping(value = "/notifications/{sendid}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Notification>> findByReceiverID(@PathVariable("sendid") String sendID){
        List<Notification> notifications = notificationService.findBySendID(sendID);
        if (notifications.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(notifications, HttpStatus.OK);
    }

    @RequestMapping(value = "/notification/create",method = RequestMethod.POST)
    public ResponseEntity<Notification> createNotification(@RequestBody Notification notification, UriComponentsBuilder builder){
        notificationService.createNotification(notification);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/notification/{sendid}").buildAndExpand(notification.getSendid()).toUri());
        return new ResponseEntity<>(notification,HttpStatus.OK);
    }


    @RequestMapping(value = "/notifications", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Notification>> find(){
        List<Notification> notifications = notificationService.findAll();
        if (notifications.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(notifications, HttpStatus.OK);
    }

    @RequestMapping(value = "/notification/notread", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Notification>> findByNotRead(){
        List<Notification> notifications = notificationService.findByNotRead();
        if (notifications.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(notifications, HttpStatus.OK);
    }
}
