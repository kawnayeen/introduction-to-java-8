package com.kawnayeen.java8._3_misc_example.matrix;

import com.kawnayeen.java8._3_misc_example._stream_util.StreamUtil;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by kawnayeen on 2/3/17.
 */
public class Matrix {
    private int numberOfRow;
    private int numberOfColumn;
    private Long[][] elements;

    public Matrix(Long[][] arrays) {
        this.numberOfRow = arrays.length;
        this.numberOfColumn = arrays[0].length;
        int columnLength = (int) Arrays.stream(arrays)
                .mapToInt(e -> (int) Arrays.stream(e).count())
                .average()
                .orElse(0);
        if (columnLength != this.numberOfColumn)
            throw new RuntimeException();

        this.elements = arrays;
    }

    public int getNumberOfRow() {
        return numberOfRow;
    }

    public int getNumberOfColumn() {
        return numberOfColumn;
    }

    public Long[][] getElements() {
        return elements;
    }

    public void setElements(Long[][] elements) {
        this.elements = elements;
    }

    public boolean isSquareMatrix() {
        return numberOfRow == numberOfColumn;
    }

    public boolean isEqualInDimension(Matrix matrix) {
        return numberOfColumn == matrix.getNumberOfColumn()
                && numberOfRow == matrix.getNumberOfRow();
    }

    public Matrix sum(Matrix matrix) {
        if (!isEqualInDimension(matrix))
            return null;
        Long[][] resultMatrix = IntStream.range(0, numberOfRow)
                .mapToObj(i -> StreamUtil.zip(
                        Arrays.stream(elements[i]),
                        Arrays.stream(matrix.getElements()[i]),
                        (a, b) -> a + b
                        ).toArray(Long[]::new)
                ).toArray(Long[][]::new);
        return new Matrix(resultMatrix);
    }
}
