package edu.hw3;

import java.util.ArrayList;
import java.util.Stack;

public class Task2 {
    private Task2() {

    }

    public static ArrayList<String> clusterize(String str) {
        if (str == null) {
            return null;
        }
        if (str.charAt(0) == ')') {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(str.length());
        ArrayList<String> res = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
                stringBuilder.append('(');
            } else {
                if (stack.empty()) {
                    return null;
                }
                stack.pop();
                stringBuilder.append(')');
                if (stack.empty()) {
                    res.add(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                }
            }
        }
        return res;
    }
}
