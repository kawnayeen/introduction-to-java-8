package com.kawnayeen.java8.lamda._3_function_intefaces._1_consumer;

import java.util.function.ObjDoubleConsumer;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _7_ObjDoubleConsumer {
    public static void main(String[] args) {
        ObjDoubleConsumer<OS> printOSVersion = (os, version) -> {
            System.out.println("Operating System : " + os.getName() + " , version : " + version);
        };

        printOSVersion.accept(new OS("Android"), 6.1);
    }
}

class OS {
    private String name;

    public OS(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
