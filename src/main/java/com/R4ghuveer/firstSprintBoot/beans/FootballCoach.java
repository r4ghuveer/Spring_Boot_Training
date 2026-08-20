package com.R4ghuveer.firstSprintBoot.beans;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Lazy;

@Component
// Adding Primary annotation makes this class as primary so that if there are 
// any other classes that implements interface Coach, Spring boot wont break  
// due to ambiguity and consider FootballCoach as default class to inject
// @Primary
//
//
// Lazy annotation is used when you want the class to only load when its object
// in required
@Lazy
public class FootballCoach implements Coach{
    private int A = 0;
    public FootballCoach(){
        System.out.println("initialized : "+getClass().getName());
    }
    @Override
    public String getCoachWorkout(){
        return "foot ball coaching";
    } 
    @Override
    public void setA(int number){
        this.A=number;
    }
    public int getA(){
        return A;
    }
}
