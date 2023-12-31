package com.javainbabysteps.advancedoop.Lecture4.example01;

/**
 *
 * @author Amer
 */
public class EnglishGreeting implements HelloWorld
{

    @Override
    public void greet()
    {
        greetSomeone("world");
    }

    @Override
    public void greetSomeone(String someone)
    {
        System.out.println("Hello " + someone);
    }
    
}
