package edu.hw1;

public class Task7 {

    private Task7() {
    }

    private static int binaryToInt(String b) {
        int n = 0;
        for (int i = 0; i < b.length(); i++) {
            n += (b.charAt(i) == '0') ? 0 : (int) Math.pow(2, b.length() - i - 1);
        }
        return n;
    }

    public static int rotateLeft(int n, int shift) {
        String num = Integer.toBinaryString(n);
        StringBuilder newNum = new StringBuilder(num.length());
        for (int i = shift; i < num.length(); i++) {
            newNum.append(num.charAt(i));
        }
        for (int i = 0; i < shift; i++) {
            newNum.append(num.charAt(i));
        }
        //Integer newN = binaryToInt(newNum.toString());
        return Integer.parseInt(newNum.toString(), 2);
    }

    public static int rotateRight(int n, int shift) {
        String num = Integer.toBinaryString(n);
        int shiftReal = shift % num.length();
        StringBuilder newNum = new StringBuilder();
        for (int i = num.length() - shift; i < num.length(); i++) {
            newNum.append(num.charAt(i));
        }
        for (int i = 0; i < num.length() - shift; i++) {
            newNum.append(num.charAt(i));
        }
        //Integer newN = binaryToInt(newNum.toString());
        return Integer.parseInt(newNum.toString(), 2);
    }
}
