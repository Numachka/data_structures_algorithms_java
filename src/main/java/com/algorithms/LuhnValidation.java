package com.algorithms;

public class LuhnValidation {

    public boolean validateLuhn(String string) {
        int length = string.length();

        if (length < 1 || length > 16)
            return false;

        int totalSum = 0, temp = 0;
        for (int i = 1; i < length + 1; i++) {
            temp = string.charAt(length - i) - '0'; // subtract '0' from char value for actual integer value.
            if (i % 2 == 0) {
                temp *= 2;
                if (temp > 9) {
                    temp -= 9;
                }
            }
            totalSum += temp;
        }

        return totalSum % 10 == 0;
    }
}
