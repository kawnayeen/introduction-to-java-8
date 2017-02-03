package com.kawnayeen.java8._3_misc_example.matrix;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by kawnayeen on 2/3/17.
 */
@DisplayName("Test core matrix functionality")
class TestMatrix {
    @DisplayName("Testing matrix construction with valid input")
    @Test
    void testMatrixInstantiation() {
        Long[][] arrays = {
                {Long.valueOf(1), Long.valueOf(2), Long.valueOf(3)},
                {Long.valueOf(2), Long.valueOf(1), Long.valueOf(3)},
                {Long.valueOf(3), Long.valueOf(2), Long.valueOf(1)}
        };
        Matrix matrix = new Matrix(arrays);
        assertNotNull(matrix);
        assertAll("Testing matrix dimension",
                () -> assertEquals(3, matrix.getNumberOfRow()),
                () -> assertEquals(3, matrix.getNumberOfColumn())
        );
    }

    @DisplayName("Invalid input will throw run time exception")
    @Test
    void testMatrixInstantiationWithBadInput() {
        Long[][] badMatrix = new Long[][]{
                {Long.valueOf(1), Long.valueOf(2), Long.valueOf(3)},
                {Long.valueOf(1), Long.valueOf(2)},
                {Long.valueOf(1)}
        };
        assertThrows(RuntimeException.class, () -> new Matrix(badMatrix));
    }

    @DisplayName("Testing the 'square matrix' logic")
    @Test
    void testSquareMatrix() {
        Long[][] squareArrays = {
                {Long.valueOf(1), Long.valueOf(2), Long.valueOf(3)},
                {Long.valueOf(2), Long.valueOf(1), Long.valueOf(3)},
                {Long.valueOf(3), Long.valueOf(2), Long.valueOf(1)}
        };
        Long[][] nonSquareArrays = {
                {Long.valueOf(1), Long.valueOf(2), Long.valueOf(3)},
                {Long.valueOf(2), Long.valueOf(1), Long.valueOf(3)}
        };
        Matrix matrix = new Matrix(squareArrays);
        assertNotNull(matrix);
        assertTrue(matrix.isSquareMatrix());
        matrix = new Matrix(nonSquareArrays);
        assertNotNull(matrix);
        assertFalse(matrix.isSquareMatrix());
    }
}
