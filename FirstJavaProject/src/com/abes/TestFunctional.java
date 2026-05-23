package com.abes;

public class TestFunctional {

    public static void main(String[] args) {

        MyInterface m = () -> System.out.println("Hello Java");

        m.show();
    }
}