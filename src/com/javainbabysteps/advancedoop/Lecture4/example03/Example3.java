package com.javainbabysteps.advancedoop.Lecture4.example03;

/**
 *
 * @author Amer
 */
public class Example3
{
    public static void main(String[] args)
    {
        HelloWorld englishGreeting = new EnglishGreeting("hello", "world");
        HelloWorld frenchGreeting = new FrenchGreeting("Salut", "tout le monde");
        
        englishGreeting.greet();
        frenchGreeting.greetSomeone("François");
        
        HelloWorld spanishGreeting 
                = new  HelloWorld("mundo") {
            protected String hello;
            
            {  // This is an instance initializer.
                this.hello = "Hola,";
                System.out.println("2 From SpanishGreeting...");
            }
            public void greet() {
                greetSomeone(this.name);
            }
            public void greetSomeone(String someone) {
                System.out.println(this.hello +" "+ someone);
            }
        };
        spanishGreeting.greet();

        SpanishGreeting2 spanishGreeting2 = new SpanishGreeting2("mundo", "Hola,");
        spanishGreeting2.greet();
    }
}
