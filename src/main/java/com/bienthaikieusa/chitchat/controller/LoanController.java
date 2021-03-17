package com.bienthaikieusa.chitchat.controller;

import com.bienthaikieusa.chitchat.model.DTO.LoanDTO;
import com.bienthaikieusa.chitchat.model.Loan;
import com.bienthaikieusa.chitchat.model.Message;
import com.bienthaikieusa.chitchat.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LoanController {

    @Autowired
    private LoanService loanService;

    @RequestMapping(value = "/loan/{studentid}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<LoanDTO>> getLoanByStudentId(@PathVariable("studentid") String studentId) {
        List<LoanDTO> loanDTO = loanService.getLoanByStudentID(studentId);
        if (loanDTO.isEmpty()) {
            return new ResponseEntity<>(loanDTO, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(loanDTO, HttpStatus.OK);
    }

    @RequestMapping(value = "/loans/{loanid}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Loan> getLoanByStudentId(@PathVariable("loanid") Long LoanId) {
        Optional<Loan> loan = loanService.findById(LoanId);
        if (!loan.isPresent()) {
            return new ResponseEntity<>( HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(loan.get(), HttpStatus.OK);
    }

    @RequestMapping(value = "/loans", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Loan>> findAllLoan() {
        List<Loan> loans = loanService.getAll();
        if (loans.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(loans, HttpStatus.OK);
    }

    @RequestMapping(value = "/loans/unactive", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Loan>> findAllUnactiveLoan() {
        List<Loan> loans = loanService.getAllUnactiveLoan();
        if (loans.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(loans, HttpStatus.OK);
    }

    @RequestMapping(value = "/loan/add", method = RequestMethod.POST)
    public ResponseEntity<Loan> addLoan(@RequestBody Loan loan) {
        Loan loanAdd = loanService.saveLoan(loan);
        return new ResponseEntity<>(loanAdd,HttpStatus.CREATED);
    }

    @RequestMapping( value = "/loan/update", method =  RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Loan> updateLoan(@RequestBody Loan loan) {
        Loan loanupdate = loanService.updateLoan(loan);
        if(loanupdate != null ) {
            return new ResponseEntity<>( HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(loan, HttpStatus.OK);
    }

    @RequestMapping( value = "/loan/delete/{id}", method =  RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Loan> deleteLoan(@PathVariable("id") Long id) {
        Optional<Loan> findByloan = loanService.findById(id);
        if (!findByloan.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        loanService.remove(findByloan.get());
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }
}
