package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);
        // defining what kind of configuration method you'll use to define the beans (@Configuration)
        FullTimeMentor ft = container.getBean(FullTimeMentor.class); // ft is a bean from the container


        PartTimeMentor pt = container.getBean(PartTimeMentor.class);
//        PartTimeMentor pt = container.getBean("p1",PartTimeMentor.class);

        ft.createAccount();
        pt.createAccount();

        String str = container.getBean(String.class);
        System.out.println(str);


    }

}
