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

// Qualifiers is used to specify the class which we want injected whenever there is ambiguity in 
// interfaces implementation
import org.springframework.beans.factory.annotation.Qualifier;


@RestController
public class restController {

    private Coach coachObj;
    private Coach coachObj2;

    //this is constructor dependency injection
    // we inject the coach object and use its methods in our rest enpoints
    @Autowired
    public restController(@Qualifier("cricketCoach")Coach coachObj, @Qualifier("cricketCoach")Coach coachObj2){
       this.coachObj = coachObj; 
       this.coachObj2 = coachObj2;
    }

    //getter setter dependency injection
    // @Autowired
    // public void setCoachObj(@Qualifier("cricketCoach")Coach coachObj){
    //     this.coachObj = coachObj;
    // }
    // Without Qualifier if there is only one interface implementation
    // @Autowired
    // public void setCoachObj(Coach coachObj){
    //     this.coachObj = coachObj;
    // }

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
        coachObj.setA(11);
        return coachObj.getCoachWorkout();
    }

    @GetMapping("/getCoachWorkout2")
    public String getCoachWorkout2(){
        coachObj2.setA(22);
        return coachObj.getCoachWorkout();
    }

    // even though we are setting different values (11 and 22)in different object of 
    // cricketCoach class, when we see logs it says
    // coachObj : 22
    // coachObj : 22
    // because by befault Spring boot does singleton object initialization i.e
    // it shares the object arcross application (so in this case coachObj2 object
    // and coachObj reference to the same object and got the same value, becasue
    // of singleton object initialization of class cricketCoach)
    @GetMapping("/check")
    public void check(){
        System.out.println("coachObj : "+coachObj.getA());
        System.out.println("coachObj2 : "+coachObj2.getA());
    }
}
