package com.test;

public class MethodReferenceExample5 {
    public static void main(String[] args) {
        Thread thread = new Thread(MethodReferenceExample5::printMessage);
        thread.start();
    }

    public static void printMessage() {
        System.out.println("It's me");
    }
}
