package com.kawnayeen.java8.stream._1_stream_srouce;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

/**
 * Created by kawnayeen on 1/27/17.
 */
public class _3_Files {
    public static void main(String[] args) throws IOException {
        streamOfLinesFromAFile();
        streamOfPathFromADirectory();
        streamOfFilePathFromADirectoryByWalking();
        streamOfFilePathFromADirectoryByFind();
    }

    private static void streamOfLinesFromAFile() throws IOException {
        System.out.println("Printing lines from a File :- ");
        Path filePath = FileSystems.getDefault().getPath("storage/text.txt");
        Stream<String> lineStream = Files.lines(filePath);
        lineStream.forEach(System.out::println);
        System.out.println();
    }

    private static void streamOfPathFromADirectory() throws IOException {
        System.out.println("Printing paths from a directory :-");
        Path directoryPath = FileSystems.getDefault().getPath("storage");
        Stream<Path> pathStream = Files.list(directoryPath);
        pathStream.forEach(System.out::println);
        System.out.println();
    }

    private static void streamOfFilePathFromADirectoryByWalking() throws IOException {
        System.out.println("Printing paths from a directory recursively:-");
        Path directoryPath = FileSystems.getDefault().getPath("storage");
        Stream<Path> pathStream = Files.walk(directoryPath, FileVisitOption.FOLLOW_LINKS);
        pathStream.forEach(System.out::println);
        System.out.println();
    }

    private static void streamOfFilePathFromADirectoryByFind() throws IOException {
        System.out.println("Printing paths from a directory that match given condition:- ");
        BiPredicate<Path, BasicFileAttributes> expectedPath = (path, attrs) ->
                attrs.isRegularFile() && path.toString().endsWith(".txt");
        Path directoryPath = FileSystems.getDefault().getPath("storage");
        Stream<Path> foundedPath = Files.find(directoryPath, 3, expectedPath);
        foundedPath.forEach(System.out::println);
        System.out.println();
    }
}
