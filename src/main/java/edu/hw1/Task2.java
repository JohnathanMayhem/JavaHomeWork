package edu.hw1;

public class Task2 {

    private Task2() {
    }

    @SuppressWarnings("MagicNumber")
    public static int countDigits(int number) {
        int tmp = number / 10;
        int count = 1;
        while (tmp != 0) {
            ++count;
            tmp /= 10;
        }
        return count;
    }
}
