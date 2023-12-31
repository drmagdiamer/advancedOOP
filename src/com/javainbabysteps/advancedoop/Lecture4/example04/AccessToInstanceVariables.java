package com.javainbabysteps.advancedoop.Lecture4.example04;

import com.javainbabysteps.advancedoop.Lecture4.example03.HelloWorld;

/**
 *
 * @author Amer
 */
public class AccessToInstanceVariables
{
    protected int a = 1;
    int b = 2;
    private int c = 3;
    
    public void test()
    {
        HelloWorld spanishGreeting  = new  HelloWorld("mundo") {
            protected String hello;
            
            {   this.hello = "Hola,"; System.out.println("2)");}
            
            public void greet() {    greetSomeone(this.name);  }
            public void greetSomeone(String someone) {
                System.out.println(this.hello +" "+ someone);
                System.out.println("a = "+ AccessToInstanceVariables.this.a);
                System.out.println("b = "+ AccessToInstanceVariables.this.b);
                System.out.println("c = "+ AccessToInstanceVariables.this.c);
            }
        };
        spanishGreeting.greet();
    }
    

}
