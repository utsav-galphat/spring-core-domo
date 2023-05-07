package com.example.springcoredomo.config;

import com.example.springcoredomo.common.Coach;
import com.example.springcoredomo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    //custom bean id
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
