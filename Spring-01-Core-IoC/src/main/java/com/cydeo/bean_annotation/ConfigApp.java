package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration //when you start an application Spring will look for configuration class, go inside and create a bean for you and put in a container
public class ConfigApp {


    // create a method
    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }

   // @Bean(name = "p1")
    @Bean
    @Primary
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

    @Bean
    PartTimeMentor partTimeMentor2(){
        return new PartTimeMentor();
    }
}
