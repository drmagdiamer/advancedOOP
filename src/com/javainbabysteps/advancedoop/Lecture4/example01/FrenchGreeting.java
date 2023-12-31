package com.javainbabysteps.advancedoop.Lecture4.example01;

/**
 *
 * @author Amer
 */
public class FrenchGreeting implements HelloWorld
{
    @Override
    public void greet()
    {
        greetSomeone("tout le monde");
    }

    @Override
    public void greetSomeone(String someone)
    {
        System.out.println("Salut " + someone);
    }    
}
