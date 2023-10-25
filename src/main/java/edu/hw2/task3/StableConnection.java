package edu.hw2.task3;

import edu.hw2.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StableConnection implements Connection {

    private final static Logger LOGGER = LogManager.getLogger();

    @Override
    public void execute(String command) {
        LOGGER.info(Status.CONNECTION_SUCSESS.getTitle());
    }

    @Override
    public void close() {
        LOGGER.info(Status.CONECTION_CLOSED.getTitle());
    }
}
