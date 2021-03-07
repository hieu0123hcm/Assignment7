package com.bienthaikieusa.chitchat.repository;

import com.bienthaikieusa.chitchat.model.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long> {

}
