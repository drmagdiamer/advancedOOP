package com.javainbabysteps.advancedoop.Lecture4.example03;



/**
 *
 * @author Amer
 */
public abstract class HelloWorld
{
    protected String name;
    
    public HelloWorld(String name)
    {
        this.name = name;
        System.out.println("1) "+name);
    }
    
    public abstract void greet();
     public abstract void greetSomeone(String someone);
}
