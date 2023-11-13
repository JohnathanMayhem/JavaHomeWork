package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {

    private Task8() {

    }

    public static boolean subTask1(String str) {
        Pattern pattern = Pattern.compile("^[01]([01][01])*$");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static boolean subTask2(String str) {
        Pattern pattern = Pattern.compile("(^0([01][01])*$)|^(1([01]))*$");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static boolean subTask3(String str) {
        Pattern pattern = Pattern.compile("^(1*01*01*01*)*$");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static boolean subTask4(String str) {
        Pattern pattern = Pattern.compile("[^(11)]|[^(111)]");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static boolean subTask5(String str) {
        Pattern pattern = Pattern.compile("^(1[01]{1})*$");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static boolean subTask7(String str) {
        Pattern pattern = Pattern.compile("(^((0*(10+)*)*)$)|(^((0*(10+)*)*)1$)");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
}
