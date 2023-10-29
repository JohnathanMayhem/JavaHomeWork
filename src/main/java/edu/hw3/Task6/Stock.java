package edu.hw3.Task6;

public class Stock {
    private double price;
    private String name;

    public Stock(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}
