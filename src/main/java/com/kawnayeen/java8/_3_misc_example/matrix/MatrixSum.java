package com.kawnayeen.java8._3_misc_example.matrix;

import java.util.stream.IntStream;

/**
 * Created by kawnayeen on 1/25/17.
 */
public class MatrixSum {
    int rows = 3;
    int cols = 3;


    public Integer[][] matrixAddition(Integer[][] firstMatrix, Integer[][] secondMatrix) {
        if (!isEqual(firstMatrix, secondMatrix))
            return null;

        Integer[][] resultMatrix = IntStream.range(0, firstMatrix.length)
                .mapToObj(r -> IntStream.range(0, firstMatrix[0].length)
                        .mapToObj(c -> (firstMatrix[r][c] + secondMatrix[r][c]))
                        .toArray(Integer[]::new))
                .toArray(Integer[][]::new);
        return resultMatrix;
    }

    boolean isEqual(Integer[][] firstOne, Integer[][] secondOne) {
        if (firstOne.length != secondOne.length)
            return false;
        for (int i = 0; i < firstOne.length; i++)
            if (firstOne[i].length != secondOne[i].length)
                return false;
        return true;
    }
}
