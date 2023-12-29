package com.javainbabysteps.advancedoop.Lecture1Ex1;

public class Main
{
    public static void main(String args[])
    {
        int x = 3;
        int y = 4;
        float z = avg(x,y);
        System.out.println("x = "+x+", y = "+ y+", z = "+ z);
    }
    public  static float avg(int a, int b)
    {
        a = a+1;
        b = b+1;
        float result = ( a + b)/2.0F;
        return result;
    }
}

