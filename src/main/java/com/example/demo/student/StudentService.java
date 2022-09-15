package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StudentService {
    @GetMapping
    public List<Student> getStudent(){
        //this object is convert in a list of in Json file
        return List.of(new Student(1L, "Giorgio", 22 , "giorgiobasile631@gmail.com"));
    }
}
