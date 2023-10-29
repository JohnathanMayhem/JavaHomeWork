package edu.hw3.Task5;

public enum SortType {
    DESC("DESC"),
    ASC("ASC");

    private String title;

    SortType(String str) {
        this.title = str;
    }

    public String getTitle() {
        return title;
    }
}
