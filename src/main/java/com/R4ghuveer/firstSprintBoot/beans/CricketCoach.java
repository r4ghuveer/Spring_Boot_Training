package com.R4ghuveer.firstSprintBoot.beans;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

// the component annotation will expose this class as available to be injected
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    private int A = 0;

    public CricketCoach(){
        System.out.println("initialized : "+getClass().getName());
    }
    @Override
    public String getCoachWorkout(){
        return "This is cricket workout!";
    }

    @Override
    public void setA(int number){
        this.A=number;
    }
    public int getA(){
        return A;
    }
}
