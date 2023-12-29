package com.javainbabysteps.advancedoop.Lecture2Ex2;

public class Main {
    public static void main(String[] args)      {
        String s1 = new String("ABC");
        String s2 = new String("ABC");
        if (s1.equals(s2))
            System.out.println("1) true ");
        else
            System.out.println("1) false ");
        if (s1 == s2 )
            System.out.println("2) true ");
        else
            System.out.println("2) false ");
        s1 = "ABC";
        s2 = "ABC";
        if (s1 == s2 )
            System.out.println("3) true ");
        else
            System.out.println("3) false ");    }

}
