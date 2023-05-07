package com.example.springcoredomo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach {

    public TennisCoach(){
        System.out.println("in class: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Hey this is Tennis coach!! Practice backhand for 20 min";
    }
}
