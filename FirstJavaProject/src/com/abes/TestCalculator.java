package com.abes;

public class TestCalculator {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        int sum1 = c.add(10, 20);
        double sum2 = c.add(10.5, 20.5);

        System.out.println("Integer Addition = " + sum1);
        System.out.println("Double Addition = " + sum2);
    }
}