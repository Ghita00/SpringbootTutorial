package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            //attention, the primary key must be different, if not overwriting!!!
            Student s1 = new Student(1L, "Giorgio", 22 , "giorgiobasile631@gmail.com");
            Student s2 = new Student(2L, "Mario", 21 , "mario55@gmail.com");

            //this method save on database all instance
            studentRepository.saveAll(
                    List.of(s1, s2)
            );
        };
    }
}
