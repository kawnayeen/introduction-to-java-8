package com.kawnayeen.java8._3_misc_example.matrix;

import java.util.Arrays;

/**
 * Created by kawnayeen on 2/3/17.
 */
public class Matrix {
    private int numberOfRow;
    private int numberOfColumn;
    private long[][] matrix;

    public Matrix(long[][] arrays) {
        this.numberOfRow = arrays.length;
        this.numberOfColumn = arrays[0].length;
        int columnLength = (int) Arrays.stream(arrays)
                .mapToInt(e -> (int) Arrays.stream(e).count())
                .average()
                .orElse(0);
        if (columnLength != this.numberOfColumn)
            throw new RuntimeException();
        this.matrix = arrays;
    }

    public int getNumberOfRow() {
        return numberOfRow;
    }

    public int getNumberOfColumn() {
        return numberOfColumn;
    }

    public long[][] getMatrix() {
        return matrix;
    }

    public boolean isSquareMatrix() {
        return numberOfRow == numberOfColumn;
    }
}
