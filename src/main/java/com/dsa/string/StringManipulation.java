package com.dsa.string;

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
}
