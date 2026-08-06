package com.R4ghuveer.firstSprintBoot.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class restController {
    @GetMapping("/")
    public String sayHello(){
        return "change it";
    }
    @GetMapping("/get")
    public String sayGet(){
        return "sayGet";
    }
}
