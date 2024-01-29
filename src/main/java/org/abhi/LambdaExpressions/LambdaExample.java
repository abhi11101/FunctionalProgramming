package org.abhi.LambdaExpressions;

public class LambdaExample {

    public static void main(String[] args) {

        voidMethodWithNoParam();
        voidMethodWithOneParam();
        voidMethodWithTwoParams();
        returnMethodWithTwoParams();

    }

    private static void voidMethodWithNoParam(){
        VoidMethodWithNoParams method = ()->{
            System.out.println("Method with no return and input param");
        };
        VoidMethodWithNoParams method2 = ()-> System.out.println("Ignoring {}");

        method.printHello();
        method2.printHello();
    }

    private static void voidMethodWithOneParam(){

        VoidMethodWithOneParam method = (input)->{
            System.out.println(input);
        };

        VoidMethodWithOneParam method2 = (input)-> System.out.println(input);

        method.printInput("Hello");
        method2.printInput("Welcome");
    }

    private static void voidMethodWithTwoParams(){

        VoidMethodWithTwoParams method = (int a, int b)->{
            int c = a+b;
            System.out.println(c);

        };

        VoidMethodWithTwoParams method2 = (a,b)-> System.out.println((a+b));

        method.addTwoParams(2,5);
        method2.addTwoParams(8,7);

    }

    private static void returnMethodWithTwoParams(){

        returnMethodWithTwoParam method = (a,b)->a*b;

        returnMethodWithTwoParam method2 = (p,q) -> {
            int r = p*q*2;
            System.out.println("R " + r);
            return p*q;
        };

        System.out.println(method.multiplyInput(4,5));
        System.out.println(method2.multiplyInput(2,3));




    }
}
