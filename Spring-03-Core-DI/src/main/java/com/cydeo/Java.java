package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {
    //@Autowired <- not recommended <- FIELD INJECTION
  //  OfficeHours officeHours;

    //CONSTRUCTOR INJECTION
    OfficeHours officeHours;
  //  @Autowired <-- inversion of control
//    public Java(OfficeHours officeHours){
//        this.officeHours = officeHours;
//    }


    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (20 + officeHours.getHours()));
    }
}
