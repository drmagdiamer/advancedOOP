package com.javainbabysteps.advancedoop.Lecture3Ex2a;

public class Person {
    protected String name;
    protected long nid;
    public Person() {
        System.out.println("Person");      }
    public void setName(String name) {
        this.name = name;       }
    public String getName() {
        return name;        }
    public void setNid(long nid) {
        this.nid = nid;     }
    public long getNid() {
        return nid;    }
}
