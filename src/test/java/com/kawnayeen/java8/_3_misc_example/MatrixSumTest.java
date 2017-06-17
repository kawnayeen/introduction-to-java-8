package com.kawnayeen.java8._3_misc_example;

import com.kawnayeen.java8._3_misc_example.matrix.MatrixSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by kawnayeen on 1/25/17.
 */
class MatrixSumTest {

    @Test
    void testMatrixAddition() {
        MatrixSum matrixSum = new MatrixSum();
        Integer[][] firstMatrix = new Integer[2][2];
        Integer[][] secondMatrix = new Integer[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                firstMatrix[i][j] = i + j;
                secondMatrix[i][j] = i * j;
            }
        }

        Integer[][] additionMatrix = matrixSum.matrixAddition(firstMatrix, secondMatrix);

        printMatrix(firstMatrix);
        System.out.println();
        printMatrix(secondMatrix);
        System.out.println();
        printMatrix(additionMatrix);

        Assertions.assertEquals(new Integer(0), additionMatrix[0][0]);
        Assertions.assertEquals(new Integer(1), additionMatrix[0][1]);
        Assertions.assertEquals(new Integer(1), additionMatrix[1][0]);
        Assertions.assertEquals(new Integer(3), additionMatrix[1][1]);
    }

    void printMatrix(Integer[][] matrix) {
        Arrays.stream(matrix)
                .forEach(
                        e -> {
                            Arrays.stream(e).
                                    forEach(f -> System.out.print(f + " "));
                            System.out.println();
                        }
                );
    }
}
