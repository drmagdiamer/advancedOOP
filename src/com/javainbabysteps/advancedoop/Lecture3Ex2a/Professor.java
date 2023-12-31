package com.javainbabysteps.advancedoop.Lecture3Ex2a;

public class Professor extends Person {
    public Professor() {
        super();
        System.out.println("Professor");
         }
    protected String departmentName;
    public void setDepartmentName(
            String departmentName) {
        this.departmentName = departmentName; }
    public String getDepartmentName() {
        return departmentName;  }  }

