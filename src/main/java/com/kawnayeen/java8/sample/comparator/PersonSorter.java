package com.kawnayeen.java8.sample.comparator;

import com.kawnayeen.java8.stream._0_housekeeping.Person;

import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class PersonSorter {
    public List<Person> sortByName(List<Person> personList) {
        return personList.stream()
                .sorted(comparing(Person::getName))
                .collect(toList());
    }

    public List<Person> sortByAge(List<Person> personList) {
        return personList.stream()
                .sorted(comparing(Person::getAge))
                .collect(toList());
    }

    public List<Person> sortByAgeThenName(List<Person> personList) {
        return personList.stream()
                .sorted(comparing(Person::getAge).thenComparing(Person::getName))
                .collect(toList());
    }

    public Map<Integer, List<String>> groupPersonNameGroupByAge(List<Person> personList) {
        return personList.stream()
                .collect(groupingBy(
                        Person::getAge,
                        mapping(Person::getName, toList())
                ));
    }
}
