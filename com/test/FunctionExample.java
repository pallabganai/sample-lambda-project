package com.test;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> function = s -> "Hello, " +s;
        System.out.println(function.apply("Pallab"));
    }
}
