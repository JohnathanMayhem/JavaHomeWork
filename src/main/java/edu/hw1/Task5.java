package edu.hw1;

public class Task5 {

    private Task5() {
    }

    @SuppressWarnings("MagicNumber")
    public static boolean isPalindrome(int number) {
        String numStr = String.valueOf(number);

        if (isPalindromeString(numStr)) {
            return true;
        }

        int newNum = 0;

        for (int i = 0; i < numStr.length() - 1; i += 2) {
            int insert = Character.getNumericValue(numStr.charAt(i)) + Character.getNumericValue(numStr.charAt(i + 1));
            newNum *= (insert / 10 > 0) ? 100 : 10;
            newNum += insert;
        }

        return (newNum > 9) && isPalindrome(newNum);
    }

    private static boolean isPalindromeString(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
