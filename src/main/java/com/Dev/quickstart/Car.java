package com.Dev.quickstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {

    // Field Injection
    @Autowired
    private Dog dog;

    @GetMapping("/ok")
    public String ok() {
        return dog.fun();
    }
}
