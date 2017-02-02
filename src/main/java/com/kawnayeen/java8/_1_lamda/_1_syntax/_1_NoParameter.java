package com.kawnayeen.java8._1_lamda._1_syntax;

/**
 * Created by kawnayeen on 1/25/17.
 */
public class _1_NoParameter {
    private static Runnable runnable = () -> System.out.println("Hi :)");

    public static void main(String[] args) {
        Thread firstThread = new Thread(runnable);
        Thread secondThread = new Thread(runnable);

        firstThread.run();
        secondThread.run();
        System.out.println("Well, After 2 decades, we have a clean read able, thread code!!!!");
    }
}
