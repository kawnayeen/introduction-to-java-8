package com.kawnayeen.java8._4_design_pattern._cascade_method;

import java.util.function.Consumer;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class Mailer {
    private Mailer() {
        System.out.println("Instantiating a mailer");
    }

    public static void send(Consumer<Mailer> block) {
        Mailer mailer = new Mailer();
        block.accept(mailer);
        System.out.println("sending ... ");
    }

    public Mailer from(String address) {
        System.out.println("From : " + address);
        return this;
    }

    public Mailer to(String address) {
        System.out.println("To : " + address);
        return this;
    }

    public Mailer subject(String subject) {
        System.out.println("Subject : " + subject);
        return this;
    }

    public Mailer body(String body) {
        System.out.println("Body : " + body);
        return this;
    }
}
