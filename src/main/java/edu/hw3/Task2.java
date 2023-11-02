package edu.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Task2 {

    private static String messageWrongSequence = "Wrong sequence";

    private Task2() {

    }

    public static List<String> clusterize(String str) throws RuntimeException {
        if (str == null) {
            return null;
        }
        if (str.charAt(0) == ')') {
            throw new RuntimeException(messageWrongSequence);
        }
        StringBuilder stringBuilder = new StringBuilder(str.length());
        ArrayList<String> result = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
                stringBuilder.append('(');
            } else {
                if (stack.empty()) {
                    throw new RuntimeException(messageWrongSequence);
                }
                stack.pop();
                stringBuilder.append(')');
                if (stack.empty()) {
                    result.add(stringBuilder.toString());
                    stringBuilder.setLength(0);
                }
            }
        }
        return result;
    }
}
