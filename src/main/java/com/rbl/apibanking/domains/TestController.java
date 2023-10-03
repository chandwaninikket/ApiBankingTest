package com.rbl.apibanking.domains;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apibanking/")
public class TestController {

    @GetMapping("/")
    public ResponseEntity<String> testController(){
        return new ResponseEntity<>("Test", HttpStatus.OK);
    }

}
