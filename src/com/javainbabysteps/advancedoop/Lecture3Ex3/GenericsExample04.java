package com.javainbabysteps.advancedoop.Lecture3Ex3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amer
 */
public class GenericsExample04
{
    public static void main( String[] args ) 
   {
      int[] data = {1,2,4,6};
      System.out.println(printAverage(data));
      System.out.println(printAverage(5,6,7,8));



      Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
      Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
      Person[] personArray = { new Person("Dr Magdi", 1), new Person("Said", 2) };

      List<Integer> integerList = toList(integerArray);
      List<Integer> integerList2 = toList(6,7,8,9 );
      List<Double> doubleList = toList(doubleArray);
      List<Character> characterList = toList(characterArray);
      List<Person> personList = toList(personArray);

      System.out.println( "Array integerArray contains:" );
      printArray( integerList );
      printArray( integerList2 ); 
      System.out.println( "\nArray doubleArray contains:" );
      printArray( doubleList );
      System.out.println( "\nArray characterArray contains:" );
      printArray( characterList );
      System.out.println( "\nArray personArray contains:" );
      printArray( personList );

      List<List<Integer>> result = toList(integerList, integerList2);
      printArray( result );

   }

   private static float printAverage(int... data) {
       if(data.length == 0)
          throw new RuntimeException("Illegal Argument");
       float result = 0;
       for(int x: data){
          result += x;
       }
       return result/ data.length;
   }


   public static <T> ArrayList<T> toList(T...  array) 
   {
        ArrayList<T> list = new ArrayList<T>();
        for (T element : array) 
            list.add(element);
        return list;
      }

   public static < T > void printArray( List<T> list )
   {
      for ( T element : list )
         System.out.printf( "%s ", element );

      System.out.println();
   }
}
