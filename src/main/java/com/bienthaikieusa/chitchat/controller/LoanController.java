package com.bienthaikieusa.chitchat.controller;

import com.bienthaikieusa.chitchat.model.DTO.LoanDTO;
import com.bienthaikieusa.chitchat.model.Loan;
import com.bienthaikieusa.chitchat.model.Message;
import com.bienthaikieusa.chitchat.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
