package com.javainbabysteps.advancedoop.Lecture3Ex2b;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Course> courseList;
    public Student(String name) {
        //super(name);
        super(name);
        courseList = new ArrayList<>();
        System.out.println("Student");  }

        public void addCourse(Course course) {
            this.courseList.add(course);        }
        public List<Course> getList() {
            return courseList;    }

}

