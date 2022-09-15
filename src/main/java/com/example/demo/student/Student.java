package com.example.demo.student;

public class Student {
    private Long id;
    private String name;
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
