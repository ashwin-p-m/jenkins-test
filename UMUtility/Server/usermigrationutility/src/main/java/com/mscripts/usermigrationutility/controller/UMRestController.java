package com.mscripts.usermigrationutility.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UMRestController {

    @GetMapping
    public ResponseEntity<String> rootRequestHandler() {

        String helloWorld = "<h1>Hello World!!!</h1><hr /><h3>Welcome to User Migration Utility</h3>";
        return new ResponseEntity<>(helloWorld, HttpStatus.OK);

    }
    
}
