package com.questions;

import java.util.Arrays;

public class CreatePhoneNumber {

    public String createPhoneNumber(int[] numbers) {
        String[] strArray = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        return String.format("(%s%s%s) %s%s%s-%s%s%s%s", (Object[]) strArray);
    }
}
