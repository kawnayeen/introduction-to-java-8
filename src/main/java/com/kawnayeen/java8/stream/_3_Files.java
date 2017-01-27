package com.kawnayeen.java8.stream;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * Created by kawnayeen on 1/27/17.
 */
public class _3_Files {
    public static void main(String[] args) throws IOException {
        Path path = FileSystems.getDefault().getPath("storage/text.txt");
        Stream<String> lineStream = Files.lines(path);
        lineStream.forEach(System.out::println);
    }
}
