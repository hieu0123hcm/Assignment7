package com.bienthaikieusa.chitchat.controller;

import com.bienthaikieusa.chitchat.model.DTO.LoanDTO;
import com.bienthaikieusa.chitchat.model.Loan;
import com.bienthaikieusa.chitchat.model.LoanRemind;
import com.bienthaikieusa.chitchat.service.LoanRemindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
public class LoanRemindController {
    @Autowired
    private LoanRemindService loanRemindService;

    @RequestMapping(value = "/loanremind/{studentid}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<LoanRemind>> getLoanRemindByStudentId(@PathVariable("studentid") String studentId) {
        List<LoanRemind> loanRemindList = loanRemindService.findLoanRemindByStuID(studentId);
        if (loanRemindList.isEmpty()) {
            return new ResponseEntity<>(loanRemindList, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(loanRemindList, HttpStatus.OK);
    }

    @RequestMapping(value = "/loanremind/add", method = RequestMethod.POST)
    public ResponseEntity<LoanRemind> addLoan(@RequestBody LoanRemind loanRemind, UriComponentsBuilder builder) {
        loanRemindService.saveLoanRemind(loanRemind);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/loanremind/{studentid}").buildAndExpand(loanRemind.getStudentId()).toUri());
        return new ResponseEntity<>(loanRemind, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/loanremind/id/{loanremindid}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoanRemind> getLoanByStudentId(@PathVariable("loanremindid") Long loanRemindID) {
        Optional<LoanRemind> loanRemind = loanRemindService.findByLoanRemindID(loanRemindID);
        if (!loanRemind.isPresent()) {
            return new ResponseEntity<>( HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(loanRemind.get(), HttpStatus.OK);
    }
}
