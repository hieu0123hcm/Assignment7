package com.bienthaikieusa.chitchat.repository;

import com.bienthaikieusa.chitchat.model.Payment;
import com.bienthaikieusa.chitchat.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long> {
    @Query("SELECT l FROM Payment l WHERE lower(l.studentID) = lower(:studentID) and l.approval = true")
    public List<Payment> findByStudentID(@Param("studentID") String studentID);
}
