package com.java.data;

public class FullTimeProfessor extends Professor {
    private int yearsOfExperience;

    public FullTimeProfessor(String name, float baseSalary, int yearsOfExperience){
        super(name, baseSalary);
        this.yearsOfExperience= yearsOfExperience;

    };

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String toString(){
        return
                "||ID: " + getId() +
                "\n||Full Time Professor" +
                "\n||Name: " + getName() +
                "\n||Salary: $" + calculateSalary() +
                "\n||Year of Experience: " + this.yearsOfExperience +
                "\n--------------------------";
    }

    @Override
    public float calculateSalary() {
        return (getBaseSalary() * 1.1F);
    }

}
