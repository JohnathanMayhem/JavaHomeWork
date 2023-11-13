package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

    private Task5() {

    }

    public static boolean isValidNumber(String str) {
        Pattern pattern = Pattern.compile("^[А-Я]{1}\\d{3}[А-Я]{2}\\d{3}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
}
