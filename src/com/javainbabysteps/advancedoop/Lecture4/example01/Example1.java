package com.javainbabysteps.advancedoop.Lecture4.example01;

/**
 *
 * @author Amer
 */
public class Example1
{
    public static void main(String[] args)
    {
        HelloWorld englishGreeting = new EnglishGreeting();
        HelloWorld frenchGreeting = new FrenchGreeting();
        
        englishGreeting.greet();
        frenchGreeting.greetSomeone("François");
        
        HelloWorld spanishGreeting 
                = new  HelloWorld() {
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                System.out.println("Hola, " + someone);
            }
        };
        
        spanishGreeting.greet();
        
        
    }
}
