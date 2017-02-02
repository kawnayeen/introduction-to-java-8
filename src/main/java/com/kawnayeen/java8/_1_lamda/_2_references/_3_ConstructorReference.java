package com.kawnayeen.java8._1_lamda._2_references;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by kawnayeen on 1/25/17.
 */
public class _3_ConstructorReference {
    public static void main(String[] args) {
        Function<Square, RectAngle> squareToRectangleConverter = RectAngle::new;
        List<Square> squares = Arrays.asList(
                new Square(4),
                new Square(6),
                new Square(9)
        );

        System.out.println(squares);

        List<RectAngle> rectAngles = new ArrayList<>();
        for (Square square : squares) {
            rectAngles.add(squareToRectangleConverter.apply(square));
        }
        System.out.println(rectAngles);
    }
}

class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}

class RectAngle {
    private int length;
    private int width;

    public RectAngle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public RectAngle(Square square) {
        this.length = square.getSide();
        this.width = square.getSide();
    }

    @Override
    public String toString() {
        return "RectAngle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
