package com.abes;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 10, 15, 20);

        // FILTER OPERATION
        System.out.println("----- Filter Operation -----");

        list.stream()
            .filter(n -> n > 10)
            .forEach(System.out::println);

        System.out.println();


        // MAP OPERATION
        System.out.println("----- Map Operation -----");

        list.stream()
            .map(n -> n * 2)
            .forEach(System.out::println);

        System.out.println();


        // COUNT OPERATION
        System.out.println("----- Count Operation -----");

        long count = list.stream()
                         .filter(n -> n > 10)
                         .count();

        System.out.println("Count = " + count);

        System.out.println();


        // COLLECT OPERATION
        System.out.println("----- Collect Operation -----");

        List<Integer> newList =
                list.stream()
                    .filter(n -> n > 10)
                    .collect(Collectors.toList());

        System.out.println(newList);

        System.out.println();


        // SORTING OPERATION
        System.out.println("----- Sorting Operation -----");

        list.stream()
            .sorted()
            .forEach(System.out::println);

        System.out.println();


        // REVERSE SORTING
        System.out.println("----- Reverse Sorting -----");

        list.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);

        System.out.println();


        // REDUCE OPERATION
        System.out.println("----- Reduce Operation -----");

        int sum = list.stream()
                      .reduce(0, (a, b) -> a + b);

        System.out.println("Sum = " + sum);

        System.out.println();


        // LAMBDA + STREAM COMBINED
        System.out.println("----- Lambda + Stream Example -----");

        List<String> names =
                Arrays.asList("Amit", "Rohit", "Anu", "Raj");

        names.stream()
             .filter(name -> name.startsWith("A"))
             .map(String::toUpperCase)
             .forEach(System.out::println);

        System.out.println();


        // PREDICATE EXAMPLE
        System.out.println("----- Predicate Example -----");

        Predicate<Integer> p = n -> n > 10;

        System.out.println(p.test(15));

        System.out.println();


        // CONSUMER EXAMPLE
        System.out.println("----- Consumer Example -----");

        Consumer<String> c = s -> System.out.println(s);

        c.accept("Hello Java");

        System.out.println();


        // FUNCTION EXAMPLE
        System.out.println("----- Function Example -----");

        Function<Integer, Integer> f = n -> n * n;

        System.out.println(f.apply(5));
    }
}