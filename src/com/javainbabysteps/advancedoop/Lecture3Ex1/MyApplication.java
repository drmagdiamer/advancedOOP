package com.javainbabysteps.advancedoop.Lecture3Ex1;

public class MyApplication {
    public static void main(String[] arg) {
        try  {
            Class c = Class.forName("com.javainbabysteps.advancedoop.Lecture3Ex1.B2");
            System.out.println("Class loaded into memory");
            Object obj = c.newInstance();
            Object obj2 = c.newInstance();
        }
        catch(Exception e)
        {   System.out.println(e);   }   }   }

