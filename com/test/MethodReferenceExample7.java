package com.test;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample7 {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("jCharl1", "fDee1", 191),
                new Person("dfCharl2", "oDee2", 192),
                new Person("kjCharl3", "bDee3", 193),
                new Person("ewCharl4", "kDee4", 194),
                new Person("fgCharl5", "klDee5", 195)
        );

        personList.forEach(System.out::println);
    }
}
