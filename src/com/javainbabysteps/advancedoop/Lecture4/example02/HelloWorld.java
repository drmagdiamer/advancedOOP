package com.javainbabysteps.advancedoop.Lecture4.example02;



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
    }

    public HelloWorld() {
        this.name = "";
    }

     public abstract void greet();
     public abstract void greetSomeone(String someone);
}
