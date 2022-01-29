package com.dsa.math;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    //Basic O(n) algorithm. Divides the passed number by all the smaller ones. If any of them give a whole number
    //that means the number isn't prime.
    //Per Wikipedia, a prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
//    public boolean isPrime(int num) {
//        if (num <= 1)
//            return false;
//
//        double divided = num; //Casting for division checking.
//        for (int i = 2; i < num; i++) {
//            double temp = divided / i;
//            if (temp % 1 == 0)
//                return false;
//        }
//        return true;
//    }

    //Progressing one step, this checks the prime factors of the number. If there is only ony factor (which is
    // the number itself) that means the number is prime.
//    public boolean isPrime(int num) {
//        double newNum = num;
//        if (newNum <= 1)
//            return false;
//
//        if (primeFactors(newNum).size() == 1) {
//            return true;
//        }
//
//        return false;
//    }

    public List<Integer> primeFactors(double num) {
        List<Integer> primeFactors = new ArrayList<>();
        int factor = 2;
        while (num > 1) {
            if (num % factor == 0) {
                primeFactors.add(factor);
                num = num / factor;
            } else {
                factor += 1;
            }
        }
        return primeFactors;
    }

    //Better search for prime factors - a prime number can be only odd!
    public boolean isPrime(int num) {
        double newNum = num;

        if (newNum <= 1) {
            return false;
        }

        return hasASinglePrimeFactor(newNum);
    }

    public List<Integer> primeFactorsEfficient(double num) {
        List<Integer> primeFactors = new ArrayList<>();

        while (num % 2 == 0) {
            primeFactors.add(2);
            num = num / 2;
        }
        int factor = 3;
        while (num >= factor * factor) {
            if (num % factor == 0) {
                primeFactors.add(factor);
                num = num / factor;
            } else {
                factor += 2;
            }
        }
        if (num != 1) {
            primeFactors.add((int) num);
        }
        return primeFactors;
    }

    //Return only if there is more than one prime factor.
    public boolean hasASinglePrimeFactor(double num) {
        int numOfFactors = 0;

        while (num % 2 == 0) {
            numOfFactors++;
            num = num / 2;
        }

        int factor = 3;
        while (num >= factor * factor) {
            if (num % factor == 0) {
                numOfFactors++;
                num = num / factor;
            } else {
                factor += 2;
            }
        }

        if (num != 1) {
            numOfFactors++;
        }

        return numOfFactors == 1;
    }
}
