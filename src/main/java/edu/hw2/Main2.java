package edu.hw2;

import edu.hw2.task3.ConnectionException;
import edu.hw2.task3.Task3;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Main2 {
    private final static Logger LOGGER = LogManager.getLogger();

    private Main2() {
    }

    @SuppressWarnings("RegexpSinglelineJava")
    public static void testTak3() {
        Task3 t = new Task3();
        try {
            LOGGER.info("EXAMPLE LAUNCH");
            t.exampleLaunch();
        } catch (ConnectionException connectionException) {
            connectionException.printStackTrace();
        }
        try {
            LOGGER.info("FAULTY LAUNCH");
            t.faultyLaunch();
        } catch (ConnectionException connectionException) {
            connectionException.printStackTrace();
        }
    }

    public static String mainFourTest() {
        return Task4.callingInfo().toString();
    }

    public static void main(String[] args) {
        testTak3();
    }
}
