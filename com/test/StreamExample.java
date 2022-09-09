package com.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hi", ",", "I", "am", "Pallab");
        List<String> integerList = stringList.stream().map(s -> s)
                .sorted((o1, o2) -> o1.toLowerCase().compareTo(o2.toLowerCase()))
                .collect(Collectors.toList());
        integerList.stream().forEach(System.out::println);

        System.out.println("=======================================");
        List<Integer> intList = Arrays.asList(3,7,4,6,1,0,5);
        System.out.println(intList.stream().max((o1, o2) -> o1.compareTo(o2)).get());

        System.out.println("=======================================");
        List<Integer> int2List = Arrays.asList(3,7,4,6,1,0,5);
        Integer[] toArray = int2List.stream().toArray(Integer[]::new);
        for (Object o: toArray
             ) {
            System.out.println(o);
        }

        System.out.println("=======================================");
        Stream<Integer> integerStream = Stream.of(3, 7, 4, 6, 1, 0, 5);

        System.out.println("=======================================");
        System.out.println(LocalDateTime.now());

        System.out.println("=======================================");
        System.out.println(ZonedDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get("PST"))));

        System.out.println("=======================================");
        System.out.println(stringList.stream()
                        .map(s -> s.toUpperCase())
                        .flatMap(s -> Stream.of(s.split("")))
                        .collect(Collectors.groupingBy(s -> s, Collectors.counting())));
    }
}
