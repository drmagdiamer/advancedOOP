package com.javainbabysteps.advancedoop.Lecture1Ex3;

import java.util.Arrays;

public class ArrayExample
{
    public static void main(String[] args)
    {
        int [] v1;
        v1 = new int[4];
        System.out.println("Array length is "+v1.length);
        v1[0] = 1;
        v1[1] = 2;
        v1[2] = 3;
        v1[3] = 4;
        //v1[4] = 5; //error
        System.out.println(v1);
        System.out.println("==>"+Arrays.toString(v1));

        int v2 [] = {1,2,3,4,5 };
        System.out.println("Array length is "+v2.length);
        for(int i=0; i<v2.length; i++)
            System.out.println("v2["+i+"] = "+v2[i]);
    }
}
