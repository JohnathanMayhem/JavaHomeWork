package edu.hw7.Task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class DataServiceWithLock {
    private final Map<Integer, Person> idCache;
    private final Map<String, List<Person>> nameCache;
    private final Map<String, List<Person>> addressCache;
    private final Map<String, List<Person>> phoneCache;
    private final ReadWriteLock lock;

    public DataServiceWithLock() {
        this.idCache = new HashMap<>();
        this.nameCache = new HashMap<>();
        this.addressCache = new HashMap<>();
        this.phoneCache = new HashMap<>();
        this.lock = new ReentrantReadWriteLock();
    }
}
