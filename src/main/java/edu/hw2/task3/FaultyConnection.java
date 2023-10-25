package edu.hw2.task3;

import edu.hw2.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FaultyConnection implements Connection {

    private final double failChanse = 0.5;
    private final static Logger LOGGER = LogManager.getLogger();

    @Override
    public void execute(String command) {
        if (0 <= failChanse) {
            LOGGER.info(Status.EXECUTION_FAILED);
            throw new ConnectionException(Status.CONNECTION_FAILED);
        } else {
            LOGGER.info(Status.CONNECTION_SUCSESS.getTitle());
        }
    }

    @Override
    public void close() {
        LOGGER.info(Status.CONECTION_CLOSED.getTitle());
    }
}
