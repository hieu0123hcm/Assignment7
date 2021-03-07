package com.bienthaikieusa.chitchat.controller;

import com.bienthaikieusa.chitchat.model.Message;
import com.bienthaikieusa.chitchat.model.Payment;
import com.bienthaikieusa.chitchat.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Optional;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "/payment/create",method = RequestMethod.POST)
    public ResponseEntity<Payment> createPayment(@RequestBody Payment payment, UriComponentsBuilder builder) {
        paymentService.save(payment);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/payment/{id}").buildAndExpand(payment.getPayment_id()).toUri());
        return new ResponseEntity<>(payment, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/payment/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Payment> getPaymentByID(@PathVariable("id") Long id) {
        Optional<Payment> payment = paymentService.findById(id);

        if (!payment.isPresent()) {
            return new ResponseEntity<>(payment.get(), HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(payment.get(), HttpStatus.OK);
    }
}
