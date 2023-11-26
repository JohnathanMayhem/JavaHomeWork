package edu.hw6.Task3;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.util.Objects;

public interface AbstractFilter extends DirectoryStream.Filter<Path> {

    @Override
    boolean accept(Path t) throws IOException;

    default AbstractFilter and(AbstractFilter other) {
        Objects.requireNonNull(other);
        return (t) -> accept(t) && other.accept(t);
    }
}

