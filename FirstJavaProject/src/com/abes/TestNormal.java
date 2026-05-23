package com.abes;

public class TestNormal {

    public static void main(String[] args) {

        Runnable r = new Runnable() {

            public void run() {
                System.out.println("Thread running");
            }
        };

        new Thread(r).start();
    }
}