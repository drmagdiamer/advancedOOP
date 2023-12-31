package com.javainbabysteps.advancedoop.Lecture4.example02;


/**
 *
 * @author Amer
 */
public class EnglishGreeting extends HelloWorld
{
    
    public EnglishGreeting(String name)
    {
        super(name);
    }

    @Override
    public void greet()
    {
        greetSomeone(name);
    }

    @Override
    public void greetSomeone(String someone)
    {
        System.out.println("Hello " + someone);
    }
    
}
