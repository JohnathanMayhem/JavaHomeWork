package edu.hw3;

import java.util.HashMap;

public class Task1 {

    private final HashMap<Character, Character> alphabet;

    public Task1() {
        alphabet = new HashMap<>();
        char one = 'b' - 'a';
        for (char i = one; i <= 'z' - 'a'; ++i) {
            char letter = (char) ('a' + (i - one));
            Character key = letter;
            letter = (char) ('z' + one - i);
            Character val = letter;
            alphabet.put(key, val);
        }
        for (char i = one; i <= 'Z' - 'A'; ++i) {
            char letter = (char) ('A' + (i - one));
            Character key = letter;
            letter = (char) ('Z' + one - i);
            Character val = letter;
            alphabet.put(key, val);
        }
    }

    public String atbash(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            if (alphabet.containsKey(str.charAt(i))) {
                stringBuilder.append(alphabet.get(str.charAt(i)));
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
