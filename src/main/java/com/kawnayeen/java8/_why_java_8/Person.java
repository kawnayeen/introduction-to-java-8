package com.kawnayeen.java8._why_java_8;

/**
 * Created by kawnayeen on 2/1/17.
 */
public class Person {

    private String name;
    private SEX sex;
    private int age;

    public Person(String name, SEX sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public SEX getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}