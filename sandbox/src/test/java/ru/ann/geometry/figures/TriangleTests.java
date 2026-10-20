package ru.ann.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

@Test
    void canCalcuatedArea () {
        var t = new Triangle (6,6,6);
        double result = t.triangleArea();
        Assertions.assertEquals(15.588, result, 0.01);


    }
@Test
    void canCalculatedPer () {
    var t = new Triangle(6,6,6);
    double result = t.trianglePerimeter();
    Assertions.assertEquals(18, result);

    }

}
