package com.javainbabysteps.advancedoop.Lecture3Ex2b;

public class Person {
    protected String name;
    protected long nid;
    public Person(String name) {
        this.name = name;
        System.out.println(
                "Person name is "+name);     }

//    public Person() {
//    }

    public void setName(String name) {
        this.name = name;       }
    public String getName() {
        return name;        }
    public void setNid(long nid) {
        this.nid = nid;     }
    public long getNid() {
        return nid;    }
}

