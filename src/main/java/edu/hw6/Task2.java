package edu.hw6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task2 {
    private Task2() {

    }

    public static void cloneFile(Path path) throws IOException {
        String fileName = path.toString();
        String extension = "";

        int dotIndex = fileName.lastIndexOf(".");
        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            extension = fileName.substring(dotIndex);
        }

        StringBuilder builder = new StringBuilder();
        builder.append(fileName.substring(0, dotIndex));
        Integer number = 1;
        builder.append(" - copy");
        if (Files.exists(Path.of(builder.toString() + extension))) {
            builder.append(" (");
            builder.append("%d");
            builder.append(")");
        }
        builder.append(extension);
        while (Files.exists(Path.of(builder.toString() + ".txt"))) {
            number += 1;
        }
        Files.createFile(Path.of(builder.toString().formatted(number)));
    }
}
