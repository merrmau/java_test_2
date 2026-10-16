package ru.ann.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

   @Test
    void canCalculateArea () {
        double result = Square.Area(5.0);
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void canCalculatedPerimeter() {
        double result = Square.perimeter(5.0);
        Assertions.assertEquals(20.0, result);
    }
}
