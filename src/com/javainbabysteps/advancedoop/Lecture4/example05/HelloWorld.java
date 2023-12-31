package com.javainbabysteps.advancedoop.Lecture4.example05;

/**
 *
 * @author Amer
 */

@FunctionalInterface
public interface HelloWorld
{
     public void greetSomeone(String someone);
     default  public void test() { System.out.println("OK");}
}




