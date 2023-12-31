package com.javainbabysteps.advancedoop.Lecture4.example05;

/**
 *
 * @author Amer
 */
public class FrenchGreeting implements HelloWorld
{

    @Override
    public void greetSomeone(String someone)
    {
        System.out.println("Salut " + someone);
    }    
}
