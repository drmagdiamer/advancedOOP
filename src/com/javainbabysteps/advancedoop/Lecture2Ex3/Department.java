package com.javainbabysteps.advancedoop.Lecture2Ex3;

public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object other){
        if(this == other)
            return true;
        if(!(other instanceof Department))
            return false;
        Department otherDepartment = (Department) other;
        return this.name.equals(otherDepartment.name) ;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}
