package com.java.data;

import java.util.List;

public abstract class Professor {
    private int id;
    private String name;
    private float baseSalary;

    private static int _id=1;

    public Professor(String name, float baseSalary) {
        this.id = _id++;
        this.name = name;
        this.baseSalary= baseSalary;
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

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * abstract methods
    */
    public abstract float calculateSalary();

    public abstract String toString();
}
