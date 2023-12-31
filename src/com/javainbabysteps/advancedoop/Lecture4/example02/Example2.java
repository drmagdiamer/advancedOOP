package com.javainbabysteps.advancedoop.Lecture4.example02;



/**
 *
 * @author Amer
 */
public class Example2
{
    public static void main(String[] args)
    {
        HelloWorld englishGreeting = new EnglishGreeting("world");
        HelloWorld frenchGreeting = new FrenchGreeting("tout le monde");
        
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

        HelloWorld spanishGreeting2
                = new  HelloWorld("mundo") {
            public void greet() {
                greetSomeone(this.name);
            }
            public void greetSomeone(String someone) {
                System.out.println("Hola, " + someone);
            }
        };
        spanishGreeting2.greet();
        
        
    }
}
