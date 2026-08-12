package com.R4ghuveer.firstSprintBoot.beans;
import org.springframework.stereotype.Component;

// the component annotation will expose this class as available to be injected
@Component
public class CricketCoach implements Coach {
    @Override
    public String getCoachWorkout(){
        return "This is cricket workout!";
    }
}
