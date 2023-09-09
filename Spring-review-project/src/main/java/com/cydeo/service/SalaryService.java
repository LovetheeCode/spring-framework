package com.cydeo.service;

import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.HoursRepository;
@Component
public class SalaryService {
    EmployeeRepository employeeRepository;
    HoursRepository hoursRepository;

    public SalaryService(EmployeeRepository employeeRepository, @Qualifier("OTH") HoursRepository hoursRepository) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
    }

    public void calculateRegularSalary(){
        //HourlyRate * Regular Hours
        System.out.println(employeeRepository.getHourlyRate() * hoursRepository.getHours());
    }
}
