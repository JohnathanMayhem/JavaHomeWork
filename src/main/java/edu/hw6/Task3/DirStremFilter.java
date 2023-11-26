package edu.hw6.Task3;

import java.nio.file.Files;
import java.util.regex.Pattern;

public class DirStremFilter {

    private DirStremFilter() {

    }

    public static final AbstractFilter REGULAR_FILE = Files::isRegularFile;
    public static final AbstractFilter READABLE = Files::isReadable;

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
