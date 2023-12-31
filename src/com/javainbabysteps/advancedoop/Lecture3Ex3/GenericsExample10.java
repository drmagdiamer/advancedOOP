package com.javainbabysteps.advancedoop.Lecture3Ex3;

/**
 *
 * @author Amer
 */
import java.util.ArrayList;
import java.util.List;

public class GenericsExample10 //GenericsWildcards 
{

    public static void main(String[] args) 
    {
        //public final class Integer extends Number (Integer is a subclass of Number)
            List<Integer> ints = new ArrayList<>();
            ints.add(3);
            ints.add(5); 
            ints.add(10);
//            double sumOld = sumOld(ints);
            //compilation error  because 
            // List<Number> is not a parent of List<Integer>
            //you will need to provide a sum method for Integer, Double, Long, ...
            double sum = sum(ints);
            System.out.println("Sum of ints="+sum);
    }
    
    public static double sumOld(List<Number> list)
    {
            double sum = 0;
            for(Number n : list){
                    sum += n.doubleValue();
            }
            return sum;
    }

    //wildcharacter means that it is a list of some class that extends Number
    public static double sum(List<? extends Number> list)
    //note List<?> is equivalent to List<? extends Object>         
    {
            double sum = 0;
            for(Number n : list){
                    sum += n.doubleValue();
            }
            return sum;
    }
}
