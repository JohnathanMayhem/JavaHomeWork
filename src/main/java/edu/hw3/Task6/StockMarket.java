package edu.hw3.Task6;

import java.util.PriorityQueue;

public class StockMarket {
    private PriorityQueue<Stock> stocks;

    public StockMarket() {
        stocks = new PriorityQueue<>((s1, s2) -> Double.compare(s2.getPrice(), s1.getPrice()));
    }

    public void add(Stock stock) {
        stocks.offer(stock);
    }

    public void remove(Stock stock) {
        stocks.remove(stock);
    }

    public Stock mostValuableStock() {
        return stocks.peek();
    }
}
