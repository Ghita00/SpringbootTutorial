package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/*JpaRepository have 2 generic
* T --> table with work(in this case is student)
* ID --> type of primary key(in this case is log because id's student is a long type)
* */
@Repository //necessary to data access
public interface StudentRepository extends JpaRepository<Student, Long> {

    //this class has one generic(T) and that is table with work(in this case is student)
    @Query("SELECT s FORM Student s where s.email = ?1") //where ?1 is the first param in url
    Optional<Student> findStudentByEmail(String email);

}
