package com.R4ghuveer.otherPackage.beans;
import org.springframework.stereotype.Component;

// the component annotation will expose this class as available to be injected
// @Component
// public class CricketCoach implements Coach {
//     @Override
//     public String getCoachWorkout(){
//         return "This is cricket workout!";
//     }
// }


// !!!!! Since this package is outside the main springboot class's package we need to 
// explicitly declare it under @SpringBootApplication for Dependency injection to 
// work
