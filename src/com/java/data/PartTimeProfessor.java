package com.java.data;

public class PartTimeProfessor extends Professor{
    private float activeHoursPerWeek;

    public PartTimeProfessor (String name, float baseSalary, float activeHoursPerWeek){
        super(name, baseSalary);
        this.activeHoursPerWeek= activeHoursPerWeek;
    }

    public float getActiveHoursPerWeek() {
        return activeHoursPerWeek;
    }

    public void setActiveHoursPerWeek(float activeHoursPerWeek) {
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    public String toString(){
        return
                "||ID: " + getId() +
                "\n||Part Time Professor" +
                "\n||Name: " + getName() +
                "\n||Salary: $" + calculateSalary() +
                "\n||Active Hours per weeek: " + this.activeHoursPerWeek +
                "\n--------------------------";
    }

    @Override
    public float calculateSalary() {
        return getBaseSalary() * 0.0052F * this.activeHoursPerWeek;
    }
}
