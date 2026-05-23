package com.abes;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<Integer, Integer> f = n -> n * n;

        System.out.println(f.apply(5));
    }
}