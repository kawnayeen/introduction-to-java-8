package com.kawnayeen.java8._why_java_8;

import com.kawnayeen.java8._why_java_8._java_7.Java7PersonRepository;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by kawnayeen on 2/2/17.
 */
@DisplayName("Testing Java 7 Implementation of IPersonRepository")
class TestJava7PersonRepository {
    static List<Person> personList;
    static IPersonRepository personRepository;

    @BeforeAll
    static void beforeAll() {
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
        personRepository = new Java7PersonRepository();
    }

    @BeforeEach
    void beforeEach() {
        assertNotNull(personList);
        assertNotNull(personRepository);
    }

    @Test
    @DisplayName("Sorting By Age")
    void testSortByAge() {
        List<Person> sortedByAge = personRepository.sortByAge(personList);
        Person youngestPerson = sortedByAge.get(0);
        assertNotNull(youngestPerson);
        assertAll("Youngest Person",
                () -> assertEquals(4, youngestPerson.getAge()),
                () -> assertEquals("Tuba", youngestPerson.getName()),
                () -> assertEquals(SEX.FEMALE, youngestPerson.getSex())
        );
    }

    @Test
    @DisplayName("Sorting By Name")
    void testSortByName() {
        List<Person> sortedByName = personRepository.sortByName(personList);
        Person alphabeticallyYoungest = sortedByName.get(0);
        assertNotNull(alphabeticallyYoungest);
        assertAll("Alphabetically youngest",
                () -> assertEquals(7, alphabeticallyYoungest.getAge()),
                () -> assertEquals("Anan", alphabeticallyYoungest.getName()),
                () -> assertEquals(SEX.MALE, alphabeticallyYoungest.getSex())
        );
    }

    @Test
    @DisplayName("Sorting By Age; in case of same age, sort by name")
    void testSortByAgeThenName() {
        List<Person> sortedByAgeThenName = personRepository.sortByAgeThenName(personList);
        Person oldestOneByAgeAndName = sortedByAgeThenName.get(personList.size() - 1);
        assertNotNull(oldestOneByAgeAndName);
        assertAll("Oldest one by age and name",
                () -> assertEquals(25, oldestOneByAgeAndName.getAge()),
                () -> assertEquals("Shiblee", oldestOneByAgeAndName.getName()),
                () -> assertEquals(SEX.MALE, oldestOneByAgeAndName.getSex())
        );

    }

    @Test
    @DisplayName("Grouping person by respective sex")
    void testGroupBySex() {
        Map<SEX, List<Person>> groupBySex = personRepository.groupBySex(personList);
        assertNotNull(groupBySex);
        List<Person> allMales = groupBySex.get(SEX.MALE);
        assertNotNull(allMales);
        List<Person> allFemales = groupBySex.get(SEX.FEMALE);
        assertNotNull(allFemales);
        assertAll("Checking male and female count",
                () -> assertEquals(7, allMales.size()),
                () -> assertEquals(4, allFemales.size())
        );
    }

    @Test
    @DisplayName("Finding Oldest Person")
    void testFindOldestPerson(){
        Person oldestPerson = personRepository.findOldestPerson(personList);
        assertNotNull(oldestPerson);
        assertAll("Oldest person",
                () -> assertEquals(25, oldestPerson.getAge()),
                () -> assertEquals(SEX.MALE, oldestPerson.getSex())
        );
    }

    @Test
    @DisplayName("Finding Oldest Male")
    void testFindOldestMale(){
        Person oldestMale = personRepository.findOldestMale(personList);
        assertAll("Oldest Male",
                () -> assertEquals(25, oldestMale.getAge()),
                () -> assertEquals(SEX.MALE, oldestMale.getSex())
        );
    }

    @Test
    @DisplayName("Finding Oldest Female")
    void testFindOldestFemale(){
        Person oldestFemale = personRepository.findOldestFemale(personList);
        assertAll("Oldest Female",
                () -> assertEquals(16, oldestFemale.getAge()),
                () -> assertEquals(SEX.FEMALE, oldestFemale.getSex())
        );
    }

    @AfterEach
    void afterEach() {
    }

    @AfterAll
    static void afterAll() {
        personList.clear();
    }
}
