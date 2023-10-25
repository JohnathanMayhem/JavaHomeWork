package edu.hw2.task3;

public class DefaultConnectionManager implements ConnectionManager {

    private final double chance = 0.5;
    private final double failChance;

    public DefaultConnectionManager() {
        this.failChance = chance;
    }

    @Override
    public Connection getConnection() {
        if (Math.random() < failChance) {
            return new FaultyConnection();
        } else {
            return new StableConnection();
        }
    }
}
