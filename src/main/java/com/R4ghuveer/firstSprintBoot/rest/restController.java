package com.R4ghuveer.firstSprintBoot.rest;
import com.R4ghuveer.firstSprintBoot.beans.Coach;
// import com.R4ghuveer.otherPackage.beans.Coach;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

// auto wired annotation which allows to scan for components that are relavent and
// inject them
import org.springframework.beans.factory.annotation.Autowired;

// properties injection using Value annotation
import org.springframework.beans.factory.annotation.Value;


@RestController
public class restController {

    private Coach coachObj;

    //this is constructor dependency injection
    // we inject the coach object and use its methods in our rest enpoints
    @Autowired
    public restController(Coach coachObj){
       this.coachObj = coachObj; 
    }

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

    @GetMapping("/getCoachWorkout")
    public String getCoachWorkout(){
        return coachObj.getCoachWorkout();
    }
}
