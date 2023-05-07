package com.example.springcoredomo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FootballCoach implements Coach {

    public FootballCoach(){
        System.out.println("in class: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Hey this is Football coach!! Practice defence for 30 min";
    }
}
