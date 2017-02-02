package com.kawnayeen.java8._0_why_java_8.resolver;

import com.kawnayeen.java8._0_why_java_8._java_8.Java8PersonRepository;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

/**
 * Created by kawnayeen on 2/2/17.
 */
public class Java8PersonRepoResolver implements ParameterResolver {
    @Override
    public boolean supports(ParameterContext parameterContext,
                            ExtensionContext extensionContext) throws ParameterResolutionException {
        return (parameterContext.getParameter().getType() == Java8PersonRepository.class);
    }

    @Override
    public Java8PersonRepository resolve(ParameterContext parameterContext,
                                         ExtensionContext extensionContext) throws ParameterResolutionException {
        return new Java8PersonRepository();
    }
}
