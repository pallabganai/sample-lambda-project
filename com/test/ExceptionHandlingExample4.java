package com.test;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int key = 0;

        process(numbers, key, wrapper((int1, int2) -> System.out.println(int1 / int2)));
    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int number: numbers) {
            biConsumer.accept(number, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer, Integer> biConsumer) {
        return (k, v) -> {
            try {
                biConsumer.accept(k, v);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("ArithmeticException-" +arithmeticException.getMessage());
            }
        };
    }
}
