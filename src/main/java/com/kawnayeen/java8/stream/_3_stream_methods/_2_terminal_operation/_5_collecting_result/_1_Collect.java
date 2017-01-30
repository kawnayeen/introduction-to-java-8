package com.kawnayeen.java8.stream._3_stream_methods._2_terminal_operation._5_collecting_result;

import com.kawnayeen.java8.stream._0_housekeeping.Person;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * Created by kawnayeen on 1/30/17.
 */
public class _1_Collect {
    private static List<Person> personList;

    public static void main(String[] args) {
        initPersonList();
        exampleGetList();
        exampleGetSet();
        exampleStringJoin();
        exampleGroupBy();
        exampleGroupBySimplified();
        examplePartitionBy();
        ultimateCollectionExample();
    }

    private static void initPersonList() {
        personList = Arrays.asList(
                new Person("Kawnayeen", 25),
                new Person("Anan", 7),
                new Person("Boni", 8),
                new Person("Gulshan", 16),
                new Person("Tuba", 4),
                new Person("Yusha", 6),
                new Person("Nafis", 7),
                new Person("Nafis", 13)
        );
        System.out.println(personList);
    }

    private static void exampleGetList() {
        System.out.println();
        List<String> names = personList.stream()
                .map(Person::getName)
                .collect(toList());
        System.out.println("Name List : " + names);
        System.out.println();
    }

    private static void exampleGetSet() {
        System.out.println("Collecting set of names from ");
        Set<String> names = personList.stream()
                .map(Person::getName)
                .collect(toSet());
        System.out.println("Name Set : " + names);
        System.out.println();
    }

    private static void exampleStringJoin() {
        System.out.println("String joining");
        String commaSeparatedName = personList.stream()
                .map(Person::getName)
                .collect(joining(", "));
        System.out.println(commaSeparatedName);
        System.out.println();
    }

    private static void exampleGroupBy() {
        System.out.println("Group by age -> list of person");
        Map<Integer, List<Person>> byAge = personList.stream()
                .collect(groupingBy(Person::getAge));
        System.out.println(byAge);
        System.out.println();
    }

    private static void exampleGroupBySimplified() {
        System.out.println("Group by age -> list of name");
        Map<Integer, List<String>> byAge = personList.stream()
                .collect(groupingBy(
                        Person::getAge,
                        mapping(Person::getName, toList())
                ));
        System.out.println(byAge);
        System.out.println();
    }

    private static void examplePartitionBy() {
        System.out.println("Partitioning by adult/minor");
        Predicate<Person> adult = person -> person.getAge() > 15;
        Map<Boolean, List<String>> adultMinors = personList
                .stream()
                .collect(Collectors.partitioningBy(
                        adult,
                        mapping(Person::getName, toList())
                ));
        System.out.println("Adults : " + adultMinors.get(true));
        System.out.println("Minors : " + adultMinors.get(false));
        System.out.println();
    }

    private static void ultimateCollectionExample() {
        System.out.println("Implementing Collector.toList() :)");
        Supplier<List<String>> strListSupplier = () -> new ArrayList<>();
        BiConsumer<List<String>, String> processNext = (list, str) -> list.add(str);
        BiConsumer<List<String>, List<String>> merge = (list1, list2) -> list1.addAll(list2);

        List<String> allNames = personList.stream()
                .map(Person::getName)
                .distinct()
                .collect(strListSupplier, processNext, merge);

        System.out.println(allNames);
        System.out.println();
    }

}
