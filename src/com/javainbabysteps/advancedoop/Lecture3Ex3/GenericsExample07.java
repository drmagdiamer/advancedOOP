package com.javainbabysteps.advancedoop.Lecture3Ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Amer
 */

class Student3 
{
    protected String name;
    protected Integer id;

    public Student3(String name, Integer id)
    {
        this.name = name;
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Student{" + "name=" + name + ", id=" + id + '}';
    }   

    
}

class NameComparator implements Comparator<Student3>
{
     public int compare(Student3 s1, Student3 s2) {

          String name1 = s1.getName();
          String name2 = s2.getName();
         if(name1 == null){
             if(name2 == null)
                 return 0;
             else
                 return -1;
         }

          //ascending order
          return name1.compareTo(name2);

        }
}

class IdComparator implements Comparator<Student3> {

        public int compare(Student3 s1, Student3 s2) {

            Integer id1 = s1.getId();
            Integer id2 = s2.getId();
            if(id1 == null){
                if(id2 == null)
                    return 0;
                else
                    return -1;
            }
            return id1.compareTo(id2);


        }

    }
    

public class GenericsExample07
{
    public static void main(String[] args)
    {
        Student3 s1 = new Student3("Ahmed",9);
        Student3 s2 = new Student3("Said",1);
        Student3 s3 = new Student3("Ahmed",2);
        ArrayList<Student3> data = new ArrayList<Student3>();
        data.add(s1);
        data.add(s2);
        data.add(s3);
        System.out.println("Before Sorting");
        System.out.println(data+"\n\n");
        Comparator<Student3> nameComparator
                = new NameComparator();
        Collections.sort(data, nameComparator );
        System.out.println("After Sorting on name");
        System.out.println(data+"\n\n");
        Comparator<Student3> idComparator
                = new IdComparator();
        Collections.sort(data, idComparator );
        System.out.println("After Sorting on id");
        System.out.println(data+"\n\n");
        
    }
}
