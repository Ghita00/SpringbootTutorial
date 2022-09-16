package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student") //where is the link for the resorce?
public class StudentControll {

    private final StudentService studentService;

    @Autowired
    public StudentControll(StudentService studentService) {
        this.studentService = studentService; //not work if i didn't use @Autowired + @Component in the StudentService
    }

    //for write
    @PostMapping
    //annonation @RequestBody is used to take the url param
    public void registerNewStudent(@RequestBody Student student) throws Exception {
        studentService.addNewStudent(student);
    }

    //for read
    @GetMapping
    public List<Student> json(){
        //this object is convert in a list of in Json file
        return studentService.getStudent();
    }

    //for delete
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id) throws Exception {
        studentService.deleteStudent(id);
    }
}
