package com.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class Student {

    @Id
    private Integer id;
    private String name;
    private int age;
    private String school;

    public Student() {

    }

    public Student(Integer id, String name, int age, String school) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
