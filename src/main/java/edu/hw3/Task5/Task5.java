package edu.hw3.Task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {

    private Task5() {

    }

    public static Contact parseContact(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] strings = str.split(" ");
        Contact contact;
        if (strings.length > 1) {
            contact = new Contact(strings[0], strings[1]);
        } else {
            contact = new Contact(str);
        }
        return contact;
    }

    public static List<Contact> parseContacts(String[] arr, SortType type) {
        List<Contact> list = new ArrayList<>();
        if (arr == null) {
            return list;
        }
        for (String s : arr) {
            list.add(parseContact(s));
        }
        ArrayList<Contact> sortedList;
        switch (type) {
            case ASC:
                sortedList = list
                    .stream()
                    .sorted()
                    .collect(Collectors.toCollection(ArrayList::new));
                break;
            case DESC:
                sortedList = list
                    .stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toCollection(ArrayList::new));
                break;
            default:
                sortedList = null;
        }
        return sortedList;
    }
}
