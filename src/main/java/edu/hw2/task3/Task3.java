package edu.hw2;

import edu.hw2.task3.DefaultConnectionManager;
import edu.hw2.task3.FaultyConnectionManager;
import edu.hw2.task3.PopularCommandExecutor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
