package com.javainbabysteps.advancedoop.Lecture3Ex3;

/**
 *
 * @author Amer
 */

class MyClass<T>{}

public class GenericsExample09
{
    public static void main(String[] args) 
    {
            Integer x = 5;
            Object obj = new Object();
            obj= x; // works because String is-a Object, inheritance in java

            MyClass<Integer> myClass1 = new MyClass<>();
            MyClass<Object> myClass2 = new MyClass<>();
            //myClass2=myClass1; // compilation error since MyClass<String> is not a MyClass<Object>
            obj = myClass1; // MyClass<T> parent is Object
       }
	
	
}
