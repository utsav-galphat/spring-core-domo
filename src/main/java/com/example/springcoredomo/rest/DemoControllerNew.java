package com.example.springcoredomo.rest;

/*
 Beans are by default singleton
 We can change the scope of bean by just adding --> @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
 to the bean
 For this demo, CricketCoach class is used
 */

import com.example.springcoredomo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllerNew {

    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoControllerNew(@Qualifier("cricketCoach") Coach theCoach,
                          @Qualifier("cricketCoach") Coach newCoach) {
        System.out.println("in class: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = newCoach;
    }

    @GetMapping("/dailyworkoutnew")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }

}
