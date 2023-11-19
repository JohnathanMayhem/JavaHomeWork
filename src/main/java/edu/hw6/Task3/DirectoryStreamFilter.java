package edu.hw6.Task3;

import java.io.IOException;
import java.nio.file.Path;

public class DirectoryStreamFilter implements AbstractFilter{
    @Override
    public boolean accept(Path dir) throws IOException {
        return false;
    }

    @Override
    public AbstractFilter and(AbstractFilter other) {
        return AbstractFilter.super.and(other);
    }
}
