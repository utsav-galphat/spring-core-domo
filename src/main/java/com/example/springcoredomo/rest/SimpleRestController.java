package com.example.springcoredomo.rest;

/*
 This is simple controller for spring overview
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
    //inject properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose '/' to return hello
    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }

    @GetMapping("/workout")
    public String workout(){
        return "Run 5km";
    }

    @GetMapping("/fortune")
    public String fortune(){
        return "Lucky today";
    }

    @GetMapping("/teamInfo")
    public String teamInfo(){
        return "Coach Name: " + coachName + ", \t Team Name: " + teamName;
    }
}

