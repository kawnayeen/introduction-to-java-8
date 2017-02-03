package com.kawnayeen.java8._3_misc_example.matrix;

/**
 * Created by kawnayeen on 2/3/17.
 */
public class Matrix {
    int numberOfRow;
    int numberOfColumn;

    public Matrix(int numberOfRow, int numberOfColumn) {
        this.numberOfRow = numberOfRow;
        this.numberOfColumn = numberOfColumn;
    }

    public int getNumberOfRow() {
        return numberOfRow;
    }

    public int getNumberOfColumn() {
        return numberOfColumn;
    }

    public boolean isSquareMatrix(){
        return numberOfRow == numberOfColumn;
    }
}
