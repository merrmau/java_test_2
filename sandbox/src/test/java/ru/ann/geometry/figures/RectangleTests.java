package ru.ann.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTests {
    @Test
    void cannotCreateRectangleWithNegativeSide() {
        try {
            new Rectangle(-5, 6);
            Assertions.fail("ИСКЛЮЧЕНИЕ");
        } catch (IllegalArgumentException exception) {
            //OK
        }
    }
}
