package edu.hw1;

import java.util.Arrays;

public class Task6 {

    private Task6() {
    }

    private final static int RAPR = 6174;

    @SuppressWarnings("MagicNumber")
    private static int[] digitsOfNumber(int num) {
        int tmp = num;
        int[] digits = new int[20];
        int len = 1;
        while (tmp > 0) {
            digits[len] = tmp % 10;
            tmp /= 10;
            ++len;
        }
        digits[len] = -1;
        digits[0] = len - 1;
        return digits;
    }

    @SuppressWarnings("MagicNumber")
    private static int[] reverseDigits(int[] digits) {
        int[] res = new int[20];
        res[0] = digits[0];
        for (int i = 1; digits[0] - i != -1; i++) {
            res[i] = digits[digits[0] - i + 1];
        }
        res[res[0] + 1] = -1;
        return res;
    }

    @SuppressWarnings("MagicNumber")
    private static int digitsToNumber(int[] digits) {
        int i = 1;
        int res = 0;
        while (digits[i] != -1) {
            res = res * 10 + digits[i];
            ++i;
        }
        return res;
    }

    private static boolean checkNumbers(int[] arr) {
        boolean res = true;
        int count = 0;
        for (int i = 1; arr[i] != -1; ++i) {
            count += (arr[1] == arr[i]) ? 1 : 0;
        }
        return count == arr[0];
    }

    @SuppressWarnings("MagicNumber")
    public static int countK(int num) {
        if (num == RAPR) {
            return 0;
        }
        int[] digits = digitsOfNumber(num);
        if (num <= 1000 || checkNumbers(digits)) {
            return -1;
        }
        Arrays.sort(digits, 1, digits[0] + 1);
        int[] digitReversed = reverseDigits(digits);
        int res = digitsToNumber(digitReversed) - digitsToNumber(digits);
        return 1 + countK(res);
    }
}
