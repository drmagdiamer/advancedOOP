package com.javainbabysteps.advancedoop.Lecture4.example06;

import com.javainbabysteps.advancedoop.Lecture4.example05.HelloWorld;

/**
 *
 * @author Amer
 */
public class AccessToVariablesFromLambda
{
    protected int a = 1;
    int b = 2;
    private int c = 3;
    
    public void test()
    {
        int z = 5;
        HelloWorld frenchGreeting   
           = someone ->  {
                System.out.println("Salut "+ someone);
                System.out.println("a = "+ AccessToVariablesFromLambda.this.a);
                System.out.println("b = "+ AccessToVariablesFromLambda.this.b);
                System.out.println("c = "+ AccessToVariablesFromLambda.this.c);
                System.out.println("z = "+ z);
        };
        frenchGreeting.greetSomeone("Claude");
        //z = 3; //compilation error
    }
    
    public static void main(String[] args)    {
        AccessToVariablesFromLambda a = new AccessToVariablesFromLambda();
        a.test();
    }
}
