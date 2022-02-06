package com.algorithms;

import java.util.Arrays;

public class MultiplicativePersistence {

    //Recursive solution.
    public int persistenceRecursive(long num) {
        if (num / 10 == 0)
            return (int) num;


        int[] values = Arrays.stream(String.valueOf(num).split("")) // Cast as string to split.
                .map(Integer::parseInt).mapToInt(val -> val).toArray(); // Cast back to int for values.

        num = 1;
        for (int i = 0; i < values.length; i++) {
            num *= values[i];
        }

        return persistenceRecursive(num);
    }

    //Recursive solution.
    public int persistence(long num) {
        int iterations = 0;
        while (num / 10 != 0) {
            iterations++;
            int[] values = Arrays.stream(String.valueOf(num).split("")) // Cast as string to split.
                    .map(Integer::parseInt).mapToInt(val -> val).toArray(); // Cast back to int for values.

            num = 1;
            for (int i = 0; i < values.length; i++) {
                num *= values[i];
            }
        }
        return iterations;
    }
}
