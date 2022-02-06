package com.basic.arrays;

import com.basic.utils.SortingUtils;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ArrayFunctions {

    //O(n).
    protected int maxConsecutiveOnes(int[] nums) {
        int currentResult = 0, finalResult = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentResult++;
                finalResult = currentResult;
            } else {
                currentResult = 0;
            }
        }
        return finalResult;
    }

    //O(n * longestDigitNumber) --> O(n^2).
    protected int findNumbersWithEvenNumberOfDigits(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            int temp = nums[i];
            while (temp != 0) {
                temp /= 10;
                j++;
            }
            if (j % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    //Basic O(n) solution with bubble sort.
    public int[] squaresOfSortedArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        return SortingUtils.integerBubbleSort(nums);
    }
}
