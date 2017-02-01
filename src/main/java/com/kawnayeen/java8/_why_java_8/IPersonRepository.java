package com.kawnayeen.java8._why_java_8;

import com.kawnayeen.java8.stream._0_housekeeping.Person;

import java.util.List;
import java.util.Map;

/**
 * Created by kawnayeen on 2/1/17.
 */
public interface IPersonRepository {
    void printAll();
    List<Person> sortByAge(List<Person> personList);
    List<Person> sortByName(List<Person> personList);
    List<Person> sortByAgeThenName(List<Person> personList);
    Map<SEX, List<Person>> groupBySex(List<Person> personList);
    Person findOldestPerson(List<Person> personList);
    Person findOldestMale(List<Person> personList);
    Person findOldestFemale(List<Person> personList);
    int averageAge(List<Person> personList);
}
