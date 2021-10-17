package com.java.data;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;

    private static int _id = 1;

    public Student(String name, int age) {
        this.id = _id++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
       return (
                "||ID: " + getId() +
                "\n||Name: " + getName() +
                "\n||Age: " + getAge() +
                "\n--------------------------"
        );
    }
}
