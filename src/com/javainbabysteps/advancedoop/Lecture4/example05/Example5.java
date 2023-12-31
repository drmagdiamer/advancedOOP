package com.javainbabysteps.advancedoop.Lecture4.example05;


/**
 *
 * @author Amer
 */
public class Example5
{
    public static void main(String [] args)  {
         HelloWorld englishGreeting = new EnglishGreeting();
        HelloWorld frenchGreeting = new FrenchGreeting();
        
        englishGreeting.greetSomeone("world");
        frenchGreeting.greetSomeone("François");
        
        HelloWorld spanishGreeting1 
                = new  HelloWorld() {

            public void greetSomeone(String someone) {
                System.out.println("Hola, " + someone);
            }
        };
        spanishGreeting1.greetSomeone("1) mundo");
        

        HelloWorld spanishGreeting2a
                =  (String someone)  -> System.out.println("Hola, " + someone);
;
        //types are not needed just to improve readability
        spanishGreeting2a.greetSomeone("2a) mundo");

        HelloWorld spanishGreeting2b
                =  (String someone)  -> {
            System.out.println("Hola, " + someone);
            System.out.println("HI");
        };
        //types are not needed just to improve readability
        spanishGreeting2b.greetSomeone("2b) mundo");

        HelloWorld spanishGreeting3a
                =  someone  -> System.out.println("Hola, " + someone);
        spanishGreeting3a.greetSomeone("3a) mundo");

        HelloWorld spanishGreeting3b
                =  someone  -> {
            System.out.println("Hola, " + someone);
            System.out.println("HI");
        };
        spanishGreeting3b.greetSomeone("3b) mundo");
    }
}
