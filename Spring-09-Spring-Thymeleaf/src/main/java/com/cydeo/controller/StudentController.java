package com.cydeo.controller;


import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //because we want to create a bean
@RequestMapping("/student") //better to put in class level
public class StudentController {

  //  @RequestMapping(value = "/register" , method = RequestMethod.GET)
    @GetMapping("/register")
    public String register(Model model) {

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register"; //--> return view (inside Student folder there is a register html), html file
    }

    //@RequestMapping("/welcome")
    @GetMapping("/welcome")
    public String info() {

        return "student/welcome";
    }


}
