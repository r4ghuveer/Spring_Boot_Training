package com.R4ghuveer.firstSprintBoot.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

// properties injection using Value annotation
import org.springframework.beans.factory.annotation.Value;


@RestController
public class restController {
    // injecting application properties using value annotation    
    @Value("${test.name}")
    private String name;

    @GetMapping("/")
    public String sayHello(){
        return "change it";
    }
    @GetMapping("/get")
    public String sayGet(){
        return "sayGet";
    }
    @GetMapping("/name")
    public String getName(){
        return name;
    }
}
