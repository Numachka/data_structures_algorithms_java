package com.basic.string;

import java.util.Arrays;
import java.util.stream.Stream;

public class VowelCounting {

    public int getCount(String str) {
        return str.replaceAll("[^aeiou]", "").length();
    }
}
