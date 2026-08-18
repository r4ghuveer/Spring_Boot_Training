package com.R4ghuveer.firstSprintBoot.beans;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
// Adding Primary annotation makes this class as primary so that if there are 
// any other classes that implements interface Coach, Spring boot wont break  
// due to ambiguity and consider FootballCoach as default class to inject
@Primary
public class FootballCoach implements Coach{
    @Override
    public String getCoachWorkout(){
        return "foot ball coaching";
    } 
}
