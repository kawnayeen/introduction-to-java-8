package com.kawnayeen.java8._why_java_8._java_8;

import com.kawnayeen.java8._why_java_8.IPersonRepository;
import com.kawnayeen.java8._why_java_8.Person;
import com.kawnayeen.java8._why_java_8.SEX;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 * Created by kawnayeen on 2/1/17.
 */
public class Java8PersonRepository implements IPersonRepository {

    @Override
    public void printAll(List<Person> personList) {
        personList.forEach(System.out::println);
    }

    @Override
    public List<Person> sortByAge(List<Person> personList) {
        return personList.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(toList());
    }

    @Override
    public List<Person> sortByName(List<Person> personList) {
        return personList.stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(toList());
    }

    @Override
    public List<Person> sortByAgeThenName(List<Person> personList) {
        return personList.stream()
                .sorted(
                        Comparator.comparingInt(Person::getAge)
                                .thenComparing(Comparator.comparing(Person::getName)))
                .collect(toList());
    }

    @Override
    public Map<SEX, List<Person>> groupBySex(List<Person> personList) {
        return personList.stream().collect(groupingBy(Person::getSex));
    }

    @Override
    public Person findOldestPerson(List<Person> personList) {
        return findOldestOne(personList, p -> true);
    }

    @Override
    public Person findOldestMale(List<Person> personList) {
        return findOldestOne(personList, p -> p.getSex() == SEX.MALE);
    }

    @Override
    public Person findOldestFemale(List<Person> personList) {
        return findOldestOne(personList, p -> p.getSex() == SEX.FEMALE);
    }

    private Person findOldestOne(List<Person> personList, Predicate<Person> personPredicate) {
        return personList.stream()
                .filter(personPredicate)
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(new Person());
    }

    @Override
    public double averageAge(List<Person> personList) {
        return personList.stream()
                .mapToInt(Person::getAge)
                .average().orElse(0);
    }
}