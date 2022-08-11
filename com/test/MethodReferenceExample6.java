package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample6 {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("jCharl1", "fDee1", 191),
                new Person("dfCharl2", "oDee2", 192),
                new Person("kjCharl3", "bDee3", 193),
                new Person("ewCharl4", "kDee4", 194),
                new Person("fgCharl5", "klDee5", 195)
        );

        //Create a method to print all elements
        filter(personList, person -> true, System.out::println);
    }

    private static void filter(List<Person> personList, Predicate<Person> condition, Consumer<Person> personConsumer) {
        for (Person person: personList) {
            if(condition.test(person))
                personConsumer.accept(person);
        }
    }
}
