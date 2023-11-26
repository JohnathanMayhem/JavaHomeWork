package edu.hw7.Task2;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class FactorialCalculator {

    private FactorialCalculator() {

    }

    public static BigInteger factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number should be non-negative.");
        }

        return LongStream.rangeClosed(1, number)
            .parallel()
            .mapToObj(BigInteger::valueOf)
            .reduce(BigInteger.ONE, BigInteger::multiply);
    }
}
