package com.example;

public class Calculator {

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        // Intentional bug: should be a / b
        return a * b;
    }
}
