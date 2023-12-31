package com.javainbabysteps.advancedoop.Lecture3Ex2b;

public class Course {
    protected int cid;
    protected String name;

    public Course() {
    }

    public Course(int cid, String name) {
        this.cid = cid;
        this.name = name;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                '}';
    }
}
