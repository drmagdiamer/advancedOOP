package com.javainbabysteps.advancedoop.Lecture5.example01;

import java.util.*;
import java.util.stream.Stream;

public class MyMain {
    public static void main(String[] args) {
        List<String> data1 = new ArrayList<>();
        data1.add("I");
        data1.add("Love");
        data1.add("Java");

        List<Person> personList1 = new ArrayList<>();
        personList1.add(new Person("Dr Magdi", 1, 2000));
        personList1.add(new Person("Ahmed", 2, 1000));
        personList1.add(Person.builder()
                        .name("Tim")
                        .id(3)
                        .salary(1500)
                .build());

        Person[] data2 = {
                new Person("Jack", 5,900),
                Person.builder()
                        .name("Bill")
                        .id(6)
                        .salary(1600)
                        .build()
        };

        List<Person> personList2 = new ArrayList<>();
        personList2.addAll(Arrays.asList(data2));

        List<Person> personList3 = Arrays.asList(new Person("Tom", 10, 300),
                Person.builder()
                        .name("Jerry")
                        .id(11)
                        .salary(100)
                        .build());



        Stream<String> stream = data1.stream();

        Stream<Character> characterStream = stream.map(str -> str.charAt(0));

        Stream<String> stringStream = characterStream.map(a -> a.toString());

        List<String> list1 = stringStream.toList();
        System.out.println(list1);

        List<String> list2 = data1.stream().map(str -> str.charAt(0)).map(a -> a.toString()).toList();
        System.out.println(list2);


        long count = personList1.stream().filter(p -> p.getSalary() > 1200).count();
        System.out.println("Persons earning more than 1200 in list1 are "+count);
        personList1.stream().filter(p -> p.getSalary() > 1200).forEach(p -> System.out.println(p));
        personList1.stream().filter(p -> p.getSalary() > 1200).forEach(System.out::println);

        List<List<Person>> compositeList = Arrays.asList(personList1, personList2, personList3);
        System.out.println("--------------");
        compositeList.stream().forEach(System.out::println);
        System.out.println("--------------");
        compositeList.stream().flatMap(list -> list.stream()).forEach(System.out::println);
        System.out.println("--------------");
        compositeList.stream().flatMap(Collection::stream).forEach(System.out::println);
        List<Person> list = compositeList.stream().flatMap(Collection::stream).toList();
        System.out.println("---");
        System.out.println(list);
        System.out.println("--------------");
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        long evenCount = intList.stream().filter(x -> x % 2 == 0).count();
        System.out.println(evenCount);

        intList.stream().filter(x -> x % 2 == 0).map(x -> x.toString()+" ").forEach(System.out::print);
        System.out.println("\n--------------");
        Optional<Integer> reduced = intList.stream().filter(x -> x % 2 == 0).reduce((a, b) -> a + b);
        System.out.println("The sum of all even numbers is "+(reduced.isPresent()?reduced.get():" not available"));


    }
}
