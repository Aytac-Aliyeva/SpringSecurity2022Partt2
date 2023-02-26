package com.example.springsecurity2022pt2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from our Api");
    }


    @GetMapping("/say-good-bye")
    public ResponseEntity<String> sayGoodbye(){
        return ResponseEntity.ok("Goodbye, see you later");
    }

}

