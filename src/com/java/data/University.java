package com.java.data;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Professor> professorsList;
    private List<Student> studentsList;
    private List<Course> coursesList;

    public University(){
        this.professorsList = new ArrayList<>();
        this.studentsList = new ArrayList<>();
        this.coursesList= new ArrayList<>();
    }

    public List<Professor> getProfessorsList() {
        return professorsList;
    }

    public void setProfessorsList(List<Professor> professorsList) {
        this.professorsList = professorsList;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public List<Course> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Course> coursesList) {
        this.coursesList = coursesList;
    }

    public void setAddStudentToCourse(int courseId, int studentId){
        this.coursesList.get(courseId-1).setAddStudent(this.studentsList.get(studentId-1));
    }

    public void setAddFullTimeProfessor(String name, float baseSalary, int yearsOfExperience) {
        this.professorsList.add(new FullTimeProfessor(name, baseSalary, yearsOfExperience));
    }
    public void setAddPartTimeProfessor(String name, float baseSalary, int activeHoursPerWeek) {
        this.professorsList.add(new PartTimeProfessor(name, baseSalary, activeHoursPerWeek));
    }

    public void setAddStudent(String name, int age) {
        this.studentsList.add(new Student(name,age ));
    }

    public void setAddCourse(String name,Professor professor ,int classRoom) {
        this.coursesList.add(new Course(name, professor, classRoom));
    }

}

