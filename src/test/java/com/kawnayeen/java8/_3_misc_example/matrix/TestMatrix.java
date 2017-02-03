package com.kawnayeen.java8._3_misc_example.matrix;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by kawnayeen on 2/3/17.
 */
@DisplayName("Test core matrix functionality")
class TestMatrix {
    @DisplayName("Testing matrix construction")
    @Test
    void testMatrixInstantiation(){
        Matrix matrix = new Matrix(3,3);
        assertNotNull(matrix);
        assertAll("Testing matrix dimension",
                ()->assertEquals(3,matrix.getNumberOfRow()),
                ()->assertEquals(3,matrix.getNumberOfColumn())
        );
    }

    @DisplayName("Testing the 'square matrix' logic")
    @Test
    void testSquareMatrix(){
        Matrix matrix = new Matrix(3,3);
        assertNotNull(matrix);
        assertTrue(matrix.isSquareMatrix());
        matrix = new Matrix(3,2);
        assertNotNull(matrix);
        assertFalse(matrix.isSquareMatrix());
    }
}
