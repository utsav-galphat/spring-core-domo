package com.example.springcoredomo.rest;

/*
 This is controller which demonstrate the uses of beans
 */

import com.example.springcoredomo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    // define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach) {
        System.out.println("in class: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    /* // define a setter for dependency injection
    @Autowired
    public void setCoach(Coach theCoach){          //any method name will work
        myCoach=theCoach;
    }
     */

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
