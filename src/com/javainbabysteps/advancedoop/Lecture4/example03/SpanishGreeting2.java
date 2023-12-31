package com.javainbabysteps.advancedoop.Lecture4.example03;

public class SpanishGreeting2 extends HelloWorld{

    protected String hello;

    public SpanishGreeting2(String name, String hello) {
        super(name);
        this.hello = hello;
        System.out.println("2 From SpanishGreeting2");
    }


    @Override
    public void greet() {
        greetSomeone(this.name);
    }

    @Override
    public void greetSomeone(String someone) {
        System.out.println(this.hello +" "+ someone);
    }
}
