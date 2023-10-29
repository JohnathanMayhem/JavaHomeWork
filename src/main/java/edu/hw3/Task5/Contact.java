package edu.hw3.Task5;

import org.jetbrains.annotations.NotNull;

public class Contact implements Comparable<Contact> {
    public String name;
    public String surname;

    public Contact(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Contact(String name) {
        this.name = name;
        this.surname = null;
    }

    @Override
    public int compareTo(@NotNull Contact o) {
        String thisName = (this.surname == null) ? this.name : this.surname;
        String oName = (o.surname == null) ? o.name : o.surname;
        return thisName.compareTo(oName);
    }

    @Override
    public String toString() {
        return (this.name + this.surname);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Contact contact = (Contact) obj;
        return (this.name.equals(contact.name) && (this.surname.equals(contact.surname)));

    }
}
