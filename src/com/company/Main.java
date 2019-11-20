package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //String tt = "aabbcc";

        StringBuilder stringBuilder = new StringBuilder();

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 60; i++) {
            list.add(random.nextInt(10));
        }

        list.forEach(stringBuilder::append);
        String randString = stringBuilder.toString();
        System.out.println(randString);

        randString.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + "=" + ((double) v / randString.length() * 100) + "%"));
    }
}
