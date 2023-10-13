package org.example;

public class AreaCalculator {

    public int calculateArea(int length, int height) {
        return length * height;
    }

    public int calculatePerimeter(int length, int height) {
        return (length + height) * 2;
    }

    public boolean isTriangle(int a, int b, int c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }

}
