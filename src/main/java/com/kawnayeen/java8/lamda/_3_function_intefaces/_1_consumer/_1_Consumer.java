package com.kawnayeen.java8.lamda._3_function_intefaces._1_consumer;

import java.util.function.Consumer;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _1_Consumer{

    public static void main(String[] args){
        exampleOne();
        tryConsumerAsParameter();
    }

    private static void exampleOne(){
        Consumer<String> printToConsole = System.out::println;
        printToConsole.accept("Hi, we are using println as consumer. Isn't that cool???");
    }

    private static void tryConsumerAsParameter(){
        consumerAsParam(s->System.out.println("got this --> "+s));
    }

    private static void consumerAsParam(Consumer<String> stringConsumer){
        stringConsumer.accept("Take It");
    }

}
