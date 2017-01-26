package com.kawnayeen.java8.lamda._3_function_intefaces._4_supplier;

import java.util.UUID;
import java.util.function.Supplier;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _1_Supplier {
    public static void main(String[] args) {
        Supplier<String> getUniqueId = () -> UUID.randomUUID().toString().replace("-", "");
        System.out.println("ID # 1 : " + getUniqueId.get());
        System.out.println("ID # 2 : " + getUniqueId.get());
    }
}
