package com.javainbabysteps.advancedoop.Lecture2Ex3;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMain {
    public static void main(String[] args) {
        Department d1 = new Department("Engineering");
        Department d2 = new Department("Marketing");
        Employee e1 = new Employee("E100", "Ahmed", d1);
        Employee e2 = new Employee("E217", "Mina", d1);
        Employee e3 = new Employee("E412", "Mona", d2);
        Employee e4 = new Employee("E217", "Tom", d2);

        Key k1 = new Key(e1.getDepartment(), e1.getId());
        Key k2 = new Key(e2.getDepartment(), e2.getId());
        Key k3 = new Key(e3.getDepartment(), e3.getId());
        Key k4 = new Key(e4.getDepartment(), e4.getId());


        Map<Key, Employee> data = new HashMap<>();
        data.put(k1, e1);
        data.put(k2, e2);
        data.put(k3, e3);
        data.put(k4, e4);
        Employee x = data.get(k4);
        if (x != null)
            System.out.println("key 4 has a name " + x.getName());

        Key key = new Key(e4.getDepartment(), e4.getId());
        Employee x2 = data.get(key);
        if (x2 != null)
            System.out.println("key 4 has a name " + x2.getName());
        else
            System.out.println("==> Not Found");

        Set<Key> keys = data.keySet();
        Employee e;
        for (Key k : keys) {
            e = data.get(k);
            System.out.println("Employee " + e.getName() + " has an Id " + e.getId()+ " and a department "
                    +(e.getDepartment()==null?" not set": e.getDepartment().getName()));
        }
    }
}
