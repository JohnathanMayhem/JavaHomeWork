package edu.hw7.Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataService implements PersonDatabase {
    private final Map<Integer, Person> idCache;
    private final Map<String, List<Person>> nameCache;
    private final Map<String, List<Person>> addressCache;
    private final Map<String, List<Person>> phoneCache;

    public DataService() {
        this.idCache = new HashMap<>();
        this.nameCache = new HashMap<>();
        this.addressCache = new HashMap<>();
        this.phoneCache = new HashMap<>();
    }

    @Override
    public synchronized void add(Person person) {
        idCache.put(person.id(), person);
        addToCache(nameCache, person.name(), person);
        addToCache(addressCache, person.address(), person);
        addToCache(phoneCache, person.phoneNumber(), person);
    }

    @Override
    public synchronized void delete(int id) {
        Person person = idCache.remove(id);
        if (person != null) {
            removeFromCache(nameCache, person.name(), person);
            removeFromCache(addressCache, person.address(), person);
            removeFromCache(phoneCache, person.phoneNumber(), person);
        }
    }

    @Override
    public synchronized List<Person> findByName(String name) {
        return nameCache.getOrDefault(name, new ArrayList<>());
    }

    @Override
    public synchronized List<Person> findByAddress(String address) {
        return addressCache.getOrDefault(address, new ArrayList<>());
    }

    @Override
    public synchronized List<Person> findByPhone(String phone) {
        return phoneCache.getOrDefault(phone, new ArrayList<>());
    }

    private void addToCache(Map<String, List<Person>> cache, String key, Person person) {
        cache.computeIfAbsent(key, k -> new ArrayList<>()).add(person);
    }

    private void removeFromCache(Map<String, List<Person>> cache, String key, Person person) {
        List<Person> people = cache.get(key);
        if (people != null) {
            people.remove(person);
            if (people.isEmpty()) {
                cache.remove(key);
            }
        }
    }
}
