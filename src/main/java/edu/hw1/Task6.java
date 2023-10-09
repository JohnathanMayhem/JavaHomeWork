package edu.hw1;

public class Task6 {

    private Task6() {
    }

    private static int count = 0;

    public static void quickSort(int[] array, int low, int high) {
        boolean flag = false;
        if (array.length == 0) {
            flag = true;
        } else {
            if (low >= high) {
                flag = true;
            }
        }

        if (flag) {
            return;
        }

        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low;
        int j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(array, low, j);
        }

        if (high > i) {
            quickSort(array, i, high);
        }
    }

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

    @SuppressWarnings("MagicNumber")
    public static int countK(int num) {
        if (num == 6174 || num < 1012) {
            return 0;
        }
        ++count;
        int[] digits = digitsOfNumber(num);
        quickSort(digits, 1, digits[0]);
        int[] digitReversed = reverseDigits(digits);
        int res = digitsToNumber(digitReversed) - digitsToNumber(digits);
        if (res == 6174) {
            int tmp = count;
            count = 0;
            return tmp;
        } else {
            return countK(res);
        }
    }
}
