package com.bienthaikieusa.chitchat.repository;

import com.bienthaikieusa.chitchat.model.Loan;
import com.bienthaikieusa.chitchat.model.LoanRemind;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRemindRepository extends CrudRepository<LoanRemind, Long> {
    @Query("SELECT l FROM LoanRemind l WHERE LOWER(l.studentId) = LOWER(:studentid) AND l.isPaid = false ")
    public List<LoanRemind> findLRByStudentID(@Param("studentid") String studentid);
}
