package com.bienthaikieusa.chitchat.service.impl;

import com.bienthaikieusa.chitchat.model.Message;
import com.bienthaikieusa.chitchat.model.Payment;
import com.bienthaikieusa.chitchat.repository.PaymentRepository;
import com.bienthaikieusa.chitchat.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public void save(Payment payment) {
        paymentRepository.save(payment);
    }

    @Override
    public Optional<Payment> findById(Long id) {
        return paymentRepository.findById(id);
    }

    @Override
    public List<Payment> findByStudentID(String studentID) {
        return paymentRepository.findByStudentID(studentID);
    }


}
