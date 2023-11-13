package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {

    private Task6() {
    }

    public static boolean isSubstringOfString(String subString, String string) {
        Pattern pattern = Pattern.compile(".*" + subString + ".*");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }
}
