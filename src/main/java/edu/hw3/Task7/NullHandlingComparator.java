package edu.hw3.Task7;

import java.util.Comparator;

public class NullHandlingComparator<T> implements Comparator<T> {
    @SuppressWarnings("unchecked")
    @Override
    public int compare(T obj1, T obj2) {
        if (obj1 == null && obj2 == null) {
            return 0;
        } else if (obj1 == null) {
            return -1;
        } else if (obj2 == null) {
            return 1;
        }
        return (obj1 instanceof Comparable && obj2 instanceof Comparable) ? ((Comparable<T>) obj1).compareTo(obj2) : 0;
    }
}
