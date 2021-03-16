package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentService {
    void save(Payment payment);
    Optional<Payment> findById(Long id);
    List<Payment> findByStudentID(String studentID);

}
