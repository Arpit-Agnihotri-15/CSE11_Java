package com.abes;

public class TestLambda {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Thread running");

        new Thread(r).start();
    }
}