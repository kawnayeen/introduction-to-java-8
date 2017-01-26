package com.kawnayeen.java8.lamda._3_function_intefaces._2_function;

import java.util.function.LongFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _7_LongFunction {
    public static void main(String[] args) {
        LongFunction<SocialSecurityNumber> getSSN = SocialSecurityNumber::new;

        SocialSecurityNumber ssn = getSSN.apply(Long.MAX_VALUE);
        System.out.println(ssn.toString());
    }
}

class SocialSecurityNumber {
    private String ssn;

    public SocialSecurityNumber(Long ssn) {
        this.ssn = ssn.toString();
    }

    @Override
    public String toString() {
        return "SocialSecurityNumber{" +
                "ssn='" + ssn + '\'' +
                '}';
    }
}
