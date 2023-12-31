package com.javainbabysteps.advancedoop.Lecture3Ex3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Amer
 */

class Student2 implements Comparable<Student2>
{
    protected String name;
    protected Integer id;

    public Student2(String name, Integer id)
    {
        this.name = name;
        this.id = id;
    }


    @Override
    public String toString()
    {
        return "Student{" + "name=" + name + ", id=" + id + '}';
    }

    @Override
    public int compareTo(Student2 other)
    {
        if(this.name == null){
            if(other.name == null){
                if(this.id == null){
                    if(other.id == null){
                        return 0;
                    } else{
                        return -1;
                    }

                }
                return this.id.compareTo(other.getId()) ;
            } else{
                return -1;
            }

        } else {
        if (this.name.compareTo(other.getName()) != 0 )
        {
            return this.name.compareTo(other.getName()) ;
        }
        if(this.id == null){
            if(other.id == null){
                return 0;
            } else{
                return -1;
            }

        }
        return this.id.compareTo(other.getId()) ; }
    }
    
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    
}

public class GenericsExample06
{
    public static void main(String[] args)
    {
        Student2 s1 = new Student2("Ahmed",9);
        Student2 s2 = new Student2("Said",1);
        Student2 s3 = new Student2("Ahmed",2);
        ArrayList<Student2> data = new ArrayList<Student2>();
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
