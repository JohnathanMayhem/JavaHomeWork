package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    private Task7() {
    }

    public static boolean subTask1(String str) {
        Pattern pattern = Pattern.compile("^([01]){2}0([01])*$");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static boolean subTask2(String str) {
        Pattern pattern = Pattern.compile("^(0|1)[01]*\\1$");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static boolean subTask3(String str) {
        Pattern pattern = Pattern.compile("^[01]{1,3}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
}
