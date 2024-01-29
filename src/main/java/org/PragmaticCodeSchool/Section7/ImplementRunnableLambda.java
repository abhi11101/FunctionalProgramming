package org.PragmaticCodeSchool.Section7;

public class ImplementRunnableLambda {


    public static void main(String[] args) {


        /**
         * Using Without lambda prior to Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        /**
         * Using Lambda
         */

        Runnable runnableLambda = ()-> {
            System.out.println("Inside Runnable 2");
        };

        new Thread(runnableLambda).start();

        new Thread(()-> System.out.println("Inside Runnable 3")).start();

    }
}
