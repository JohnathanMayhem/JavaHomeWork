package edu.hw7.Task4;

public class MethodMontecarlo {

    private MethodMontecarlo() {

    }

    private static boolean isInCircle(double x, double y) {
        return Math.sqrt(x * x + y * y) <= 1; //we have unit-radius circle
    }

    @SuppressWarnings("MagicNumber")
    public static double pi(long amountOfNumbers) {
        double x;
        double y;
        long count = 0;
        double countInnerPoints = 0;
        while (count < amountOfNumbers) {
            x = Math.random();
            y = Math.random();
            countInnerPoints += (isInCircle(x, y)) ? 1 : 0;
            ++count;
        }
        return countInnerPoints / amountOfNumbers * 4;
    }
}
