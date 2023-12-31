package com.javainbabysteps.advancedoop.Lecture3Ex3;

import java.util.List;

/**
 *
 * @author Amer
 */

class Tuple2<T, U>
{
    T obj1;  // An object of type T
    U obj2;  // An object of type U 

    public Tuple2(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public U getObj2() {
        return obj2;
    }

    public void setObj2(U obj2) {
        this.obj2 = obj2;
    }

    @Override
    public String toString() {
        return "Tuple2{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                '}';
    }
}

class Tuple3<K, T, U>
{
    K obj1;
    T obj2;  // An object of type T
    U obj3;  // An object of type U

    // constructor
    Tuple3(K obj1,T obj2, U obj3)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public K getObj1() {
        return obj1;
    }

    public void setObj1(K obj1) {
        this.obj1 = obj1;
    }

    public T getObj2() {
        return obj2;
    }

    public void setObj2(T obj2) {
        this.obj2 = obj2;
    }

    public U getObj3() {
        return obj3;
    }

    public void setObj3(U obj3) {
        this.obj3 = obj3;
    }

    @Override
    public String toString() {
        return "Tuple3{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                ", obj3=" + obj3 +
                '}';
    }
}

public class GenericsExample08
{
    public static void main (String[] args) 
    {
        Tuple2 <String, Integer> test1 =
            new Tuple2<>("GfG", 15);

        System.out.println(test1);

        Tuple2 <Float, String> test2 =
            new Tuple2<>(12.1F, "Hello");

        System.out.println(test2);

        Tuple3<Integer,Integer,Float> result = minMaxAvg(1,5,
                23, 78, 22, 45, 232, 567, 444, 68);

        System.out.printf("Minimum is %s\n", result.getObj1());
        System.out.printf("Maximum is %s\n", result.getObj2());
        System.out.printf("Average is %s\n", result.getObj3());
    }

    public static  Tuple3<Integer,Integer,Float> minMaxAvg(Integer... data){
        if(data.length == 0)
            throw new RuntimeException("Bad Data");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        float average = 0;
        for(int x: data){
            if(x>max)
                max = x;
            if(x<min)
                min = x;
            average += x;
        }
        average = average/ data.length;
        return new Tuple3<>(min, max, average);

    }


}
