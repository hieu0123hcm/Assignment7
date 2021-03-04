package com.bienthaikieusa.chitchat.controller;


import com.bienthaikieusa.chitchat.model.Admin;
import com.bienthaikieusa.chitchat.model.Subject;
import com.bienthaikieusa.chitchat.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService service;

    @RequestMapping(value = "/admin/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Admin> findByAccountId(@PathVariable Long id) {
        Admin admin =  service.findByAccountId(id);

        if (admin == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(admin, HttpStatus.OK);
    }
}
