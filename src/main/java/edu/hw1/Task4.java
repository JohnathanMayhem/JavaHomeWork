package edu.hw1;

public class Task4 {

    private Task4() {
    }

    public static String fixString(String str) {
        char[] charArr = str.toCharArray();
        char tmp = charArr[0];
        for (int i = 0; i < str.length() - 1; i += 2) {
            tmp = charArr[i];
            charArr[i] = charArr[i + 1];
            charArr[i + 1] = tmp;
        }
        String newStr = new String(charArr);
        return newStr;
    }
}
