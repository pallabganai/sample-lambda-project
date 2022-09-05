package com.test;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.isEmpty();

        System.out.println(predicate.test(""));
    }
}
