package com.basic.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@DisplayName("Testing the arrays leetcode assignments.")
class ArrayFunctionsTest {
    private ArrayFunctions arrayFunctions;

    @BeforeEach
    void setUp() {
        arrayFunctions = new ArrayFunctions();
    }

    @Test
    @DisplayName("Given a binary array nums, return the maximum number of consecutive 1's in the array.")
    void maxConsecutiveOnesTest() {
        int[] nums = {1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0};
        int result = arrayFunctions.maxConsecutiveOnes(nums);
        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("Given an array nums of integers, return how many of them contain an even number of digits.")
    void findNumbersWithEvenNumberOfDigitsTest() {
        int[] nums = {12, 345, 2, 6, 7896, 15164, 44, 332, 54648, 123160, 52};
        int result = arrayFunctions.findNumbersWithEvenNumberOfDigits(nums);
        Assertions.assertEquals(5, result);
    }

    @Test
    @DisplayName("Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.")
    void squaresOfSortedArrayTest() {
        int nums[] = {-4, -1, 0, 6, 10};
        int result[] = arrayFunctions.squaresOfSortedArray(nums);
        int expected[] = {0, 1, 16, 36, 100};
        Assertions.assertEquals(true, Arrays.equals(result, expected));
    }
}