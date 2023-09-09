package com.cydeo.service;

import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OvertimeSalaryService {

    EmployeeRepository employeeRepository;
    HoursRepository hoursRepository;

    public OvertimeSalaryService(EmployeeRepository employeeRepository, @Qualifier("OTH") HoursRepository hoursRepository) {
        this.hoursRepository = hoursRepository;
        this.employeeRepository = employeeRepository;
    }

    public void calculateOvertimeSalary(){
        System.out.println(hoursRepository.getHours()*employeeRepository.getHourlyRate());
    }


}
