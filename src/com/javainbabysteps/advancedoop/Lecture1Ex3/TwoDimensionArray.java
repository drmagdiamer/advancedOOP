package com.javainbabysteps.advancedoop.Lecture1Ex3;

import java.util.Arrays;

public class TwoDimensionArray {
    public static void main(String args[])  {
        int [][] v1= new int[3][4];
        System.out.println("v1: "+ Arrays.toString(v1));
        System.out.println("v1: "+ Arrays.deepToString(v1));
        for(int i=0; i<v1.length; i++){
            for(int j=0; j<v1[i].length; j++){
                v1[i][j] = i+(j*2);
            }
        }
        System.out.println("v1: "+ Arrays.deepToString(v1));
        int [][] v2 = new int[3][];
        System.out.println("v2: "+ Arrays.deepToString(v2));
        for(int i=0; i<v2.length; i++)
            v2[i] = new int[3];
        System.out.println("v2: "+ Arrays.deepToString(v2));
        int [][] v3 = new int[3][];
        for(int i=0; i<v3.length; i++)
            v3[i] = new int[i+1];
        System.out.println("v3: "+ Arrays.deepToString(v3));
        int [][] v4 =
                { {1, 2}, {3, 6, 8}, {6}};
        System.out.println("v4: "+ Arrays.deepToString(v4));
        System.out.printf("v4.length = %d, v4[0].length = %d, v4[1].length = %d, v4[2].length = %d",
                v4.length, v4[0].length, v4[1].length, v4[2].length);
    }

}
