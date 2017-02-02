package com.kawnayeen.java8._0_why_java_8;

import com.kawnayeen.java8._0_why_java_8._java_8.Java8PersonRepository;
import com.kawnayeen.java8._0_why_java_8.resolver.Java8PersonRepoResolver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Created by kawnayeen on 2/2/17.
 */
@ExtendWith(Java8PersonRepoResolver.class)
@DisplayName("Testing Java 8 implementation of Person Repository")
public class TestJava8PersonRepo extends TestPersonRepository {
    @BeforeAll
    static void beforeAll(Java8PersonRepository java8PersonRepository) {
        personRepository = java8PersonRepository;
    }
}
