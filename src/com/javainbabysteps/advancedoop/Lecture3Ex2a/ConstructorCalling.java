package com.javainbabysteps.advancedoop.Lecture3Ex2a;

public class ConstructorCalling {
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.setName("Java");
        Course c2 = new Course();
        c2.setName("C++");
        Student s1 = new Student();
        s1.setName("Tom");
        s1.setNid(111);
        s1.addCourse(c1);
        s1.addCourse(c2);
        Student s2 = new Student();
        s2.setName("Said");
        s2.setNid(121);
        s2.addCourse(c2);
        Person p = new Professor();  }   }

