package com.javainbabysteps.advancedoop.Lecture3Ex3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Amer
 */

class Student implements Comparable
{
    protected String name;
    protected int id;
    public Student(String name, Integer id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString()    {
        return "Student{" + "name=" + name + ", id=" + id + '}';
    }

    @Override
    public int compareTo(Object obj)    {
        if(!(obj instanceof Student))
        {
            return 0; //if different class, comparison is meaningless
        }
        Student other = (Student) obj;
        if(this.name == null){
            if(other.name == null){
                if(this.id == other.id)
                    return 0;
                if(this.id > other.id)
                    return -1;
                return 1;
            } else{
                return -1;
            }

        } else {
            if (this.name.compareTo(other.getName()) != 0 )
            {
                return this.name.compareTo(other.getName()) ;
            }

            if(this.id == other.id)
                return 0;
            if(this.id < other.id)
                return -1;
            return 1;}

    }
    
     public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }    
    
}

public class GenericsExample05
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Ahmed",9);
        Student s2 = new Student("Said",1);
        Student s3 = new Student("Ahmed",2);
        ArrayList<Student> data = new ArrayList<Student>();
        data.add(s1);
        data.add(s2);
        data.add(s3);
        System.out.println("Before Sorting");
        System.out.println(data+"\n\n");
        Collections.sort(data);
        System.out.println("After Sorting");
        System.out.println(data+"\n\n");
        
    }
}
