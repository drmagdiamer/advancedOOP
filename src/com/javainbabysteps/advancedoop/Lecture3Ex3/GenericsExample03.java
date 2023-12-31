package com.javainbabysteps.advancedoop.Lecture3Ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Amer
 */
public class GenericsExample03
{
    public static void main( String[] args ) 
   {
      Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
      Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
      String[] stringArray = { "I", "Love", "Java" };

      Person[] personArray = { new Person("Dr Magdi", 1), new Person("Said", 2) };

      System.out.println( "Array integerArray contains:" );
      printArray( integerArray ); // pass an Integer array
      System.out.println( "\nArray doubleArray contains:" );
      printArray( doubleArray ); // pass a Double array
      System.out.println( "\nArray characterArray contains:" );
      printArray( characterArray ); // pass a Character array
      System.out.println( "\nArray stringArray contains:" );
      printArray( stringArray ); // pass a Character array
      System.out.println( "\nArray personArray contains:" );
      printArray( personArray );

      //////////////////////////////

      List<Integer> list1 = toList(integerArray);
      System.out.println("List 1");
      System.out.println(Arrays.toString(list1.toArray()));

      List<Double> list2 = toList(doubleArray);
      System.out.println("List 2");
      System.out.println(Arrays.toString(list2.toArray()));

      List<Character> list3 = toList(characterArray);
      System.out.println("List 3");
      System.out.println(Arrays.toString(list3.toArray()));

      List<Object> list4 = toList(stringArray);
      System.out.println("List 4");
      System.out.println(Arrays.toString(list4.toArray()));


      List<Person> list5 = toList(personArray); // cannot type cast as List<Object> is not a superclass of List<String>

      //list5.add(22); // compilation error
      for(Person value: list5) {
         System.out.println("First Person name is " + value.getName());
      }


   } // end main

   public static <T> void printArray( T[] inputArray )
   {
      for ( T element : inputArray )
         System.out.printf( "%s ", element );

      System.out.println();
   }

   
   public static <T> ArrayList<T> toList(T[] array) 
   {
        ArrayList<T> list = new ArrayList<T>();
        for (T element : array) 
            list.add(element);
        return list;
      }
}
