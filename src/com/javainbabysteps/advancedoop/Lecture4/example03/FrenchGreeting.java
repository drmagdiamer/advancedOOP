package com.javainbabysteps.advancedoop.Lecture4.example03;

/**
 *
 * @author Amer
 */
public class FrenchGreeting extends HelloWorld
{
    protected String hello;
    
    public FrenchGreeting(String hello, String name)
    {
        super(name);
        this.hello = hello;
    }

    @Override
    public void greet()
    {
        greetSomeone(name);
    }

    @Override
    public void greetSomeone(String someone)
    {
        System.out.println(this.hello +" "+ someone);
    }
    
}