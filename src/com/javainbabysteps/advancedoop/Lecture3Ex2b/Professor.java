package com.javainbabysteps.advancedoop.Lecture3Ex2b;

public class Professor extends Person {
    public Professor(String name) {
        super(name);
        System.out.println("Professor"); }
    protected String departmentName;
    public void setDepartmentName(
            String departmentName) {
        this.departmentName = departmentName; }
    public String getDepartmentName() {
        return departmentName;  }  }

