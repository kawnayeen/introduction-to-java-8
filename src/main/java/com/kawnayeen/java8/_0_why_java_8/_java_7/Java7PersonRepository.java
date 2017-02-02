package com.kawnayeen.java8._0_why_java_8._java_7;

import com.kawnayeen.java8._0_why_java_8.IPersonRepository;
import com.kawnayeen.java8._0_why_java_8.Person;
import com.kawnayeen.java8._0_why_java_8.SEX;

import java.util.*;

/**
 * Created by kawnayeen on 2/1/17.
 */
public class Java7PersonRepository implements IPersonRepository {

    @Override
    public void printAll(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person.toString());
        }
    }

    @Override
    public List<Person> sortByAge(List<Person> personList) {
        personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));
            }
        });
        return personList;
    }

    @Override
    public List<Person> sortByName(List<Person> personList) {
        personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return personList;
    }

    @Override
    public List<Person> sortByAgeThenName(List<Person> personList) {
        personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int value = new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));
                if (value == 0) {
                    value = o1.getName().compareTo(o2.getName());
                }
                return value;
            }
        });
        return personList;
    }

    @Override
    public Map<SEX, List<Person>> groupBySex(List<Person> personList) {
        List<Person> malePerson = new ArrayList<>();
        List<Person> femalePerson = new ArrayList<>();
        Map<SEX, List<Person>> mapBySex = new HashMap<>();

        for (Person person : personList) {
            if (person.getSex() == SEX.MALE) {
                malePerson.add(person);
            } else {
                femalePerson.add(person);
            }
        }

        mapBySex.put(SEX.MALE, malePerson);
        mapBySex.put(SEX.FEMALE, femalePerson);
        return mapBySex;
    }

    @Override
    public Person findOldestPerson(List<Person> personList) {
        Person oldestOne = new Person();
        for (Person person : personList) {
            if (person.getAge() > oldestOne.getAge()) {
                oldestOne = person;
            }
        }
        return oldestOne;
    }

    @Override
    public Person findOldestMale(List<Person> personList) {
        Person oldestOne = new Person();
        for (Person person : personList) {
            if (person.getSex() == SEX.MALE) {
                if (person.getAge() > oldestOne.getAge()) {
                    oldestOne = person;
                }
            }
        }
        return oldestOne;
    }

    @Override
    public Person findOldestFemale(List<Person> personList) {
        Person oldestOne = null;
        int maxAge = -1;
        for (Person person : personList) {
            if (person.getSex() == SEX.FEMALE) {
                if (person.getAge() > maxAge) {
                    oldestOne = person;
                    maxAge = person.getAge();
                }
            }
        }
        return oldestOne;
    }

    @Override
    public double averageAge(List<Person> personList) {
        double totalAge = 0;
        for (Person person : personList)
            totalAge += person.getAge();
        return totalAge / personList.size();
    }
}