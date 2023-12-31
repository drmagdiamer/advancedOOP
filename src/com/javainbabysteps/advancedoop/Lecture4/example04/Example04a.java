package com.javainbabysteps.advancedoop.Lecture4.example04;

import com.javainbabysteps.advancedoop.Lecture4.example01.EnglishGreeting;
import com.javainbabysteps.advancedoop.Lecture4.example01.FrenchGreeting;
import com.javainbabysteps.advancedoop.Lecture4.example01.HelloWorld;

public class Example04a {
    public static void main(String[] args)
    {
        HelloWorld englishGreeting = new EnglishGreeting();
        HelloWorld frenchGreeting = new FrenchGreeting();

        englishGreeting.greet();
        frenchGreeting.greetSomeone("François");

        HelloWorld spanishGreeting
                = new  HelloWorld() {
            private String name;
            private String hello;

            {  // This is an instance initializer.
                this.name = "mundo";
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


    }
}
