package com.kawnayeen.java8.sample.pattern._cascade_method;

import java.util.function.Consumer;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class ResourceCascade {
    private ResourceCascade(){
        System.out.println("Allocating Resource Cascade");
    }
    public ResourceCascade op1(){
        System.out.println("Performing operation#1");
        return this;
    }

    public ResourceCascade op2(){
        System.out.println("Performing operation#2");
        return this;
    }

    private void close(){
        System.out.println("Deallocating Resource Cascade");
    }

    public static void use(Consumer<ResourceCascade> block){
        ResourceCascade resource = new ResourceCascade();
        try{
            block.accept(resource);
        }finally {
            resource.close();
        }
    }
}
