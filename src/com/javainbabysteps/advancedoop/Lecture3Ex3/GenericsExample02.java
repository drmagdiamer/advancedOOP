package com.javainbabysteps.advancedoop.Lecture3Ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Amer
 */
public class GenericsExample02
{
   public static void main( String[] args )
   {
      // create arrays of Integer, Double and Character
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

      List<Object> list5 = toList(personArray);

      //List<String> list6 = (List<Object>) list5; // cannot type cast as List<Object> is not a superclass of List<String>



      //list5.add(22); //will cause a class cast exception

      for(Object value: list5) {
         System.out.println("First Person name is " + ((Person)value).getName());
      }

   } // end main

//   public static void printArray( Integer[] inputArray )
//   {
//      for ( Integer element : inputArray )
//         System.out.printf( "%s ", element );
//
//      System.out.println();
//   }
//
//
//   public static void printArray( Double[] inputArray )
//   {
//      for ( Double element : inputArray )
//         System.out.printf( "%s ", element );
//
//      System.out.println();
//   }
//
//   public static void printArray( Character[] inputArray )
//   {
//      for ( Character element : inputArray )
//         System.out.printf( "%s ", element );
//
//      System.out.println();
//   }
//
//   public static void printArray( String[] inputArray )
//   {
//      for ( String element : inputArray )
//         System.out.printf( "%s ", element );
//
//      System.out.println();
//   }

   public static void printArray( Object[] inputArray )
   {
      for ( Object element : inputArray )
         System.out.printf( "%s ", element );

      System.out.println();
   }



   /////////////////////////////////////////////


   public static List<Integer> toList( Integer[] inputArray )
   {
      List<Integer> result = new ArrayList<>();
      for(Integer element: inputArray){
         result.add(element);
      }
      return result;
   }


   public static List<Double> toList( Double[] inputArray )
   {
      List<Double> result = new ArrayList<>();
      for(Double element: inputArray){
         result.add(element);
      }
      return result;
   }


   public static List<Character> toList( Character[] inputArray )
   {
      List<Character> result = new ArrayList<>();
      for(Character element: inputArray){
         result.add(element);
      }
      return result;
   }


//   public static List<String> toList( String[] inputArray )
//   {
//      List<String> result = new ArrayList<>();
//      for(String element: inputArray){
//         result.add(element);
//      }
//      return result;
//   }

//   public static List<Person> toList( Person[] inputArray )
//   {
//      List<Person> result = new ArrayList<>();
//      for(Person element: inputArray){
//         result.add(element);
//      }
//      return result;
//   }
//
   public static List<Object> toList( Object[] inputArray )
   {
      List<Object> result = new ArrayList<>();
      for(Object element: inputArray){
         result.add(element);
      }
      return result;
   }




}
