package com.javainbabysteps.advancedoop.Lecture2Ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("E100", "Ahmed");
        Employee e2 = new Employee("E217", "Mina");
        Employee e3 = new Employee("E412", "Mona");
        Map<String, Employee> data = new HashMap<String, Employee>();
        data.put("E100", e1);
        data.put("E217", e2);
        data.put("E412", e3);
        Employee x = data.get("E217");
        if (x != null)
            System.out.println("Id E217 has a name " + x.getName());
        Employee e4 = new Employee("E217", "Tom");
        data.put("E217", e4);


        Employee x2 = data.get("ABC");
        if (x2 == null)
            System.out.println("No employee with id ABC");

        Set<String> keys = data.keySet();
        Employee e;
        for (String k : keys) {
            e = data.get(k);
            System.out.println("Employee " + e.getName() + " has an Id " + k);
        }
    }
}
