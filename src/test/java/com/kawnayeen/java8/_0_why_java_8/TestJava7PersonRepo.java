package com.kawnayeen.java8._0_why_java_8;

import com.kawnayeen.java8._0_why_java_8._java_7.Java7PersonRepository;
import com.kawnayeen.java8._0_why_java_8.resolver.Java7PersonRepoResolver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Created by kawnayeen on 2/2/17.
 */
@ExtendWith(Java7PersonRepoResolver.class)
@DisplayName("Testing Java 7 implementation of person repository")
public class TestJava7PersonRepo extends TestPersonRepository {
    @BeforeAll
    static void beforeAll(Java7PersonRepository java7PersonRepository) {
        personRepository = java7PersonRepository;
    }
}
