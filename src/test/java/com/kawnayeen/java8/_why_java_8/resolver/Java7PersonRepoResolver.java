package com.kawnayeen.java8._why_java_8.resolver;

import com.kawnayeen.java8._why_java_8._java_7.Java7PersonRepository;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

/**
 * Created by kawnayeen on 2/2/17.
 */
public class Java7PersonRepoResolver implements ParameterResolver {
    @Override
    public boolean supports(ParameterContext parameterContext,
                            ExtensionContext extensionContext) throws ParameterResolutionException {
        return (parameterContext.getParameter().getType() == Java7PersonRepository.class);
    }

    @Override
    public Java7PersonRepository resolve(ParameterContext parameterContext,
                                         ExtensionContext extensionContext) throws ParameterResolutionException {
        return new Java7PersonRepository();
    }
}
