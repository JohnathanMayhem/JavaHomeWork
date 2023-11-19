package edu.hw6.Task3;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class DirStremFilter {
    public static final AbstractFilter regularFile = Files::isRegularFile;
    public static final AbstractFilter readable = Files::isReadable;

    public static AbstractFilter largerThan(int length) {
        return path -> path.toFile().length() > length;
    }

    public static AbstractFilter globMatches(String glob) {
        return path -> path.getFileSystem().getPathMatcher("glob:" + glob).matches(path.getFileName());
    }

    public static AbstractFilter regexContains(String regex) {
        return path -> Pattern.matches(regex, path.toString());
    }



}
