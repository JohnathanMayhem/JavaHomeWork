package edu.hw2.task3;

public class Task3 {

    @SuppressWarnings("MagicNumber")
    public void exampleLaunch() {
        PopularCommandExecutor popularCommandExecutor =
            new PopularCommandExecutor(new DefaultConnectionManager(), 3);
        popularCommandExecutor.updatePackages();
    }

    @SuppressWarnings("MagicNumber")
    public void faultyLaunch() {
        PopularCommandExecutor popularCommandExecutor =
            new PopularCommandExecutor(new FaultyConnectionManager(), 3);
        popularCommandExecutor.updatePackages();
    }

    protected final static double CHANCE = 0.5;

    public Task3() {

    }
}
