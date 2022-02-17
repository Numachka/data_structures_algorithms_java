package com.questions;

public class MultipleOf3Or5 {
    public int multipleOfThreeOrFive(int number) {
        int result = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 15 == 0) {
                result += i;
            }
        }
        return result;
    }

}
