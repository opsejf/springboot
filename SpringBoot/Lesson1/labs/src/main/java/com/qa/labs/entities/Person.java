package com.qa.labs.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Person {

    //as a note, the integer parameters in this code isnt declared
    //as int in the labs, it is declared as Integer

    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "full_name", nullable = false, unique = true)
    private String name;
    private Integer age;
    private String job;

//    public Integer getId() {
//        return id;
//    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public String getJob(){
        return job;
    }

//    public void setId(Integer value) {
//        id = value;
//    }

    public void setName(String value){
        name = value;
    }

    public void setAge(Integer value){
        age = value;
    }

    public void setJob(String value){
        job = value;
    }

    public Person(String name, int age, String job){
        setName(name);
        setAge(age);
        setJob(job);
    }

    public Person(int value, String name, int age, String job){
        id = value;
        setName(name);
        setAge(age);
        setJob(job);
    }

    public Person(){};


}
