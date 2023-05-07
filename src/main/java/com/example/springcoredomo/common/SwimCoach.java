package com.example.springcoredomo.common;

public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("in class: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Hey this is Swimming coach!! Swim for 30 min";
    }
}
