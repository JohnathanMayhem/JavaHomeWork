package edu.hw6.Task3;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;


public interface AbstractFilter extends DirectoryStream.Filter<Path> {

    @Override
    public boolean accept(Path t) throws IOException;

    public default AbstractFilter and (AbstractFilter other){
        Objects.requireNonNull(other);
        return (t) -> accept(t) && other.accept(t);
    }
}

