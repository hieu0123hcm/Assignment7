package com.bienthaikieusa.chitchat.repository;

import com.bienthaikieusa.chitchat.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


//pHUC
@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
    @Query("SELECT l FROM Student l WHERE l.account_id = :account_id")
    public Student findByAccountID(@Param("account_id") String account_id);
}
