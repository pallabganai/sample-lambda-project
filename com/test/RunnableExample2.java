package com.test;

public class RunnableExample2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Pallab"));
        thread.start();
    }
}
