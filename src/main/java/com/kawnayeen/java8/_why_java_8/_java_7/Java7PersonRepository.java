package com.kawnayeen.java8._why_java_8._java_7;

import com.kawnayeen.java8._why_java_8.IPersonRepository;
import com.kawnayeen.java8._why_java_8.Person;
import com.kawnayeen.java8._why_java_8.SEX;

import java.util.List;
import java.util.Map;

/**
 * Created by kawnayeen on 2/1/17.
 */
public class Java7PersonRepository implements IPersonRepository {

    @Override
    public void printAll(List<Person> personList) {

    }

    @Override
    public List<Person> sortByAge(List<Person> personList) {
        return null;
    }

    @Override
    public List<Person> sortByName(List<Person> personList) {
        return null;
    }

    @Override
    public List<Person> sortByAgeThenName(List<Person> personList) {
        return null;
    }

    @Override
    public Map<SEX, List<Person>> groupBySex(List<Person> personList) {
        return null;
    }

    @Override
    public Person findOldestPerson(List<Person> personList) {
        return null;
    }

    @Override
    public Person findOldestMale(List<Person> personList) {
        return null;
    }

    @Override
    public Person findOldestFemale(List<Person> personList) {
        return null;
    }

    @Override
    public int averageAge(List<Person> personList) {
        return 0;
    }
}
