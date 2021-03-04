package com.bienthaikieusa.chitchat.repository;

import com.bienthaikieusa.chitchat.model.Loan;
import com.bienthaikieusa.chitchat.model.Message;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends CrudRepository<Loan, Long> {
    @Query("SELECT l FROM Loan l WHERE LOWER(l.studentId) = LOWER(:studentid) ORDER BY l.loanId DESC")
    public List<Loan> findByStudentID(@Param("studentid") String studentid);
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
}
