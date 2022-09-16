package com.example.demo.student;
import javax.persistence.*;

//REMEMBER: EVERY TABLE HAVE ONE FILE! ==> 3 TABLE == 3 CLASS FILE with different package
//convert this class in a database's table
//when the application will start if the table wasn't in database, the table will create
@Entity
@Table
public class Student {
    //this is for primary key with auto increment
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id; //with the annotation @Id this row is a primary key with auto increment was started by 1
    private String name;
    @Transient //this information will be not in table, this information is only in class
    private int age;
    private String email;

    public Student(){

    }

    public Student(Long id, String name, int age, String email){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Student(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
