package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class ConfigCar {

    @Bean
            Car car() {
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }
//Direct Wiring
//    @Bean
//    Person person(){
//        Person p = new Person();
//        p.setName("Mike");
//        p.setCar(car()); // <- direct wiring - this person has a car
//        return p;
//    }

    //Autowiring
    @Bean
    Person person(Car car){
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car); // <- direct wiring - this person has a car
        return p;
    }
}
