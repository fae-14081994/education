package com.geekbrains.lesson4;

import com.geekbrains.lesson4.TriangleArea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void successSquareCalculation() throws Exception {
        Assertions.assertEquals(com.geekbrains.lesson4.TriangleArea.TriangleAreaCalculate
                (3, 4, 5), 6);
        Assertions.assertTrue(Math.abs(com.geekbrains.lesson4.TriangleArea.TriangleAreaCalculate
                (3, 4, 5) - 6) < 0.0001);
        Assertions.assertEquals(6, com.geekbrains.lesson4.TriangleArea.TriangleAreaCalculate
                (3, 4, 5), 0.0002);
    }

    @Test
    void negativeTriangleTest() {
        Assertions.assertThrows(Exception.class, () -> TriangleArea.TriangleAreaCalculate
                (-3, 4, 5));
    }

}
