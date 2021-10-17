package com.java.data;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int id;
    private String name;
    private Professor professor;
    private int classRoom;
    private List<Student> studentList;

    private static int _id = 1;

    public Course(String name,Professor professor ,int classRoom ){
        this.id= _id++;
        this.name = name;
        this.professor = professor;
        this.classRoom = classRoom;
        this.studentList = new ArrayList<>();
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(int classRoom) {
        this.classRoom = classRoom;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void  setAddStudent(Student student){
        this.studentList.add(student);
    }

    public String toString(){
        return (
                "||ID: " + getId() +
                "\n||Name: " + getName() +
                "\n||Professor: " + getProfessor().getName() +
                "\n--------------------------"
        );
    }
}
