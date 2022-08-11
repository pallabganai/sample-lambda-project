package com.test;

public class LearnLambda1 {
    public static void main(String[] args) {
        Hello hello = name -> System.out.println("This is " +name);

        hello.greetings("Pallab");
    }
}
