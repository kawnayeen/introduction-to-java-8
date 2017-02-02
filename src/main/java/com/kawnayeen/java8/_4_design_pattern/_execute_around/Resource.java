package com.kawnayeen.java8._4_design_pattern._execute_around;

import java.util.function.Consumer;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class Resource {

    private Resource() {
        System.out.println("Allocating Resources");
    }

    public static void use(Consumer<Resource> block) {
        Resource resource = new Resource();
        try {
            block.accept(resource);
        } finally {
            resource.close();
        }
    }

    public void op1() {
        System.out.println("Performing operation#1");
    }

    public void op2() {
        System.out.println("Performing operation#2");
    }

    private void close() {
        System.out.println("Deallocating Resources");
    }
}
