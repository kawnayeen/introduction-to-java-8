package com.kawnayeen.java8.sample.pattern._decorator;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Created by kawnayeen on 1/25/17.
 */
public class StringProcessor {
    private Function<String, String> filter;

    public StringProcessor() {
        setFilter();
    }

    public void setFilter(final Function<String, String>... filters) {
        filter = Arrays.asList(filters)
                .stream()
                .reduce(Function.identity(), Function::andThen);
    }

    public String getProcessedString(String string) {
        String processedString = filter.apply(string);
        return processedString;
    }

}
