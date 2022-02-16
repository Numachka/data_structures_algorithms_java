package com.basic.string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringManipulation {

    public String disemvowel(String string) {
        String[] vowels = {"a", "o", "u", "e", "i", "A", "O", "U", "E", "I"};
        for (int i = 0; i < vowels.length; i++) {
            string = string.replace(vowels[i] ,"");
        }
        return string;
    }

    public String disemvowelV2(String string) {
        return string.replaceAll("[ieaouIEAOU]", "");
    }

    public String camelCase(String input) { //camelCase -> camel Case
//        return Stream.of(input.split("")).map(letter -> {
//            if (!input.isEmpty() && letter.charAt(0) < 'a')
//                return " " + letter;
//            return letter;
//        }).collect(Collectors.joining(""));
        return input.replaceAll("([A-Z])", " $1");
    }
}
