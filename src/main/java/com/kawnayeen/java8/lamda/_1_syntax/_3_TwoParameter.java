package com.kawnayeen.java8.lamda._1_syntax;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kawnayeen on 1/25/17.
 */
public class _3_TwoParameter {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Anan", 7),
                new Person("Tuba", 4),
                new Person("Yusha", 6),
                new Person("Boniyameen", 8),
                new Person("Gulshan", 16)
        );

        System.out.println(personList);

        System.out.println("Sorting by age :) :)");
        personList.sort((person1, person2) -> person1.getAge().compareTo(person2.getAge()));
        System.out.println(personList);

        System.out.println("Sorting by name :) :)");
        personList.sort((person1, person2) -> person1.getName().compareTo(person2.getName()));
        System.out.println(personList);
    }
}

class Person {
    String name;
    Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
