package com.example.aws.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AWSController {
     // http://localhost:8081/api/ -->Hello AWS SpringBoot
    @GetMapping("/")
    public ResponseEntity<?> aws(){
        return new ResponseEntity<>("Hello AWS SpringBoot", HttpStatus.OK);
    }
}
