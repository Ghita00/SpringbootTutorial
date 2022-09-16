package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired //that is necessary for constructor
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //for write, post request
    public void addNewStudent(Student student) throws Exception {
        System.out.println(student);
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if(studentByEmail.isPresent()){
            throw new Exception("email taken");
        }
        studentRepository.save(student);
    }

    //for read, get request
    public List<Student> getStudent(){
        //this object is convert in a list of in Json file
        //return List.of(new Student(1L, "Giorgio", 22 , "giorgiobasile631@gmail.com"));

        //studentRepository is an interface for read information by the table
        return studentRepository.findAll();
    }

    public void deleteStudent(Long id) throws Exception {
        //studentRepository.findById(id);
        boolean x = studentRepository.existsById(id);
        if(!x){
            throw new Exception("not found");
        }
        studentRepository.deleteById(id);


    }
}
