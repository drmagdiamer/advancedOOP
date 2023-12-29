package com.javainbabysteps.advancedoop.Lecture2Ex3;

import java.util.Objects;

public class Key extends Object{
    private Department department;
    private String id;

    public Key(Department department, String id) {
        this.department = department;
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object other){
        //return super.equals(other);
        if(this == other)
            return true;
        if(!(other instanceof Key))
            return false;
        Key otherKey = (Key) other;
        return this.id.equals(otherKey.id) &&
                this.department.equals(otherKey.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, id);
    }

    @Override
    public String toString() {
        return "Key{" +
                ", department is " + (department==null?"null":this.department.getName()) +
                ", id='" + id + '\'' +
                '}';
    }
}
