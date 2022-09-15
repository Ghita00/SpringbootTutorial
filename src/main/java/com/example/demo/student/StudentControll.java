package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student") //where is the link for the resorce?
public class StudentControll {

    private final StudentService studentService;

    @Autowired
    public StudentControll(StudentService studentService) {
        this.studentService = studentService; //not work if i didn't use @Autowired + @Component in the StudentService
    }

    @GetMapping
    public List<Student> json(){
        //this object is convert in a list of in Json file
        return studentService.getStudent();
    }
}
