package com.kawnayeen.java8.sample;

import com.kawnayeen.java8.stream._0_housekeeping.Person;
import com.kawnayeen.java8.sample.comparator.PersonSorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class PersonSorterTest {

    List<Person> personList;
    PersonSorter personSorter;

    @BeforeEach
    void initPersonList() {
        personList = Arrays.asList(
                new Person("Gulshan", 16),
                new Person("Rownil", 7),
                new Person("Anan", 7),
                new Person("Abbu", 63)
        );
        personSorter = new PersonSorter();
    }

    @Test
    void testSortByPersonName() {
        assertNotNull(personList);
        assertNotNull(personSorter);
        assertEquals("Gulshan", personList.get(0).getName());
        personList = personSorter.sortByName(personList);
        assertEquals("Abbu", personList.get(0).getName());
    }

    @Test
    void testSortByPersonAge() {
        assertNotNull(personList);
        assertNotNull(personSorter);
        assertEquals(16, personList.get(0).getAge());
        personList = personSorter.sortByAge(personList);
        assertEquals(7, personList.get(0).getAge());

    }

    @Test
    void testSortByPersonAgeThenName() {
        assertNotNull(personList);
        assertNotNull(personSorter);
        personList = personSorter.sortByAgeThenName(personList);
        assertEquals(7, personList.get(0).getAge());
        assertEquals("Anan", personList.get(0).getName());
    }

    @Test
    void testGroupByAge() {
        assertNotNull(personList);
        assertNotNull(personSorter);
        List<String> getNamesOfSevenYearsOld = personSorter.groupPersonNameGroupByAge(personList).get(7);
        assertTrue(getNamesOfSevenYearsOld.contains("Anan"));
        assertTrue(getNamesOfSevenYearsOld.contains("Rownil"));
    }
}
