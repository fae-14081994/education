package com.geekbrains.lesson4;

public class TriangleArea {
    public static int TriangleAreaCalculate(int A, int B, int C) throws Exception {

        if (A < 0 || B < 0 || C < 0) throw new Exception();
        int HalfPerimeter = (A + B + C) / 2;
        int square = (HalfPerimeter * (HalfPerimeter - A) * (HalfPerimeter - B) * (HalfPerimeter - C));
        return (int) Math.sqrt(square);

    }

}
