package com.kawnayeen.java8._2_stream._1_stream_srouce;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

/**
 * Created by kawnayeen on 1/27/17.
 */
public class _3_Files {
    public static void main(String[] args) throws IOException {
        //streamOfLinesFromAFile();
        //streamOfPathFromADirectory();
        //streamOfFilePathFromADirectoryByWalking();
        //streamOfFilePathFromADirectoryByFind();
        addSurahNumberAndAyatNumberAtEachAyatFile();
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

    private static void addSurahNumberAndAyatNumberAtEachAyatFile() throws IOException {
        System.out.println("Printing paths from a directory that match given condition:- ");
        BiPredicate<Path, BasicFileAttributes> expectedPath = (path, attrs) ->
                attrs.isRegularFile() && path.toString().endsWith(".json");
        Path directoryPath = FileSystems.getDefault().getPath("001");
        Stream<Path> foundedPath = Files.find(directoryPath, 3, expectedPath);
        foundedPath.forEach(_3_Files::addSurahAndAyatName);
        System.out.println();
    }

    private static void addSurahAndAyatName(Path path) {
        try {
            Scanner scanner = new Scanner(new FileInputStream(path.toFile()));
            List<String> exitingContent = new ArrayList<>();
            while (scanner.hasNextLine()) {
                exitingContent.add(scanner.nextLine());
            }
            String fileName = path.getFileName().toString();
            String ayatNumber = fileName.substring(3, 6);
            String surahNumber = fileName.substring(0, 3);
            exitingContent.add(2, "\"surahNumber\":\"" + surahNumber + "\",");
            exitingContent.add(3, "\"ayatNumber\":\"" + ayatNumber + "\",");
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(path.toFile(), false));
            exitingContent.forEach(printWriter::println);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
