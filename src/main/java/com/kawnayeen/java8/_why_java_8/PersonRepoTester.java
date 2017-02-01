package com.kawnayeen.java8._why_java_8;

import com.kawnayeen.java8._why_java_8._java_7.Java7PersonRepository;
import com.kawnayeen.java8._why_java_8._java_8.Java8PersonRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by kawnayeen on 2/1/17.
 */
public class PersonRepoTester {
    private static List<Person> personList;

    public static void main(String[] args) {
        initPersonList();
        runRepoTester(getJava8Version());
    }

    private static void initPersonList() {
        personList = Arrays.asList(
                new Person("Shiblee", SEX.MALE, 25),
                new Person("Kawnayeen", SEX.MALE, 25),
                new Person("Kamarul", SEX.MALE, 25),
                new Person("Gulshan", SEX.FEMALE, 16),
                new Person("Nawshin", SEX.FEMALE, 16),
                new Person("Anan", SEX.MALE, 7),
                new Person("Nafis", SEX.MALE, 7),
                new Person("Razin", SEX.MALE, 7),
                new Person("Tuba", SEX.FEMALE, 4),
                new Person("Yusha", SEX.FEMALE, 6),
                new Person("Boni", SEX.MALE, 8)
        );
    }

    private static IPersonRepository getJava7Version() {
        return new Java7PersonRepository();
    }

    private static IPersonRepository getJava8Version() {
        return new Java8PersonRepository();
    }

    private static void runRepoTester(IPersonRepository personRepository) {
        System.out.println("Printing All Persons");
        personRepository.printAll(personList);
        System.out.println();

        System.out.println("Sorting By Age");
        personRepository.sortByAge(personList).forEach(System.out::println);
        System.out.println();

        System.out.println("Sorting By Name");
        personRepository.sortByName(personList).forEach(System.out::println);
        System.out.println();

        System.out.println("Sorting By Age, Then Name");
        personRepository.sortByAgeThenName(personList).forEach(System.out::println);
        System.out.println();

        System.out.println("Group By Sex");
        Map<SEX, List<Person>> grouping = personRepository.groupBySex(personList);
        System.out.println("Males : ");
        grouping.get(SEX.MALE).forEach(System.out::println);
        System.out.println("Females : ");
        grouping.get(SEX.FEMALE).forEach(System.out::println);
        System.out.println();

        System.out.println("Oldest Peron ");
        System.out.println(personRepository.findOldestPerson(personList).toString());
        System.out.println();

        System.out.println("Oldest Male ");
        System.out.println(personRepository.findOldestMale(personList).toString());
        System.out.println();

        System.out.println("Oldest Female ");
        System.out.println(personRepository.findOldestFemale(personList).toString());
        System.out.println();

        System.out.println("Average Age : " + personRepository.averageAge(personList));
    }
}
