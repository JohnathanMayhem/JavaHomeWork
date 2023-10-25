package edu.hw2.task3;

import edu.hw2.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConnectionException extends RuntimeException {
    private final static Logger LOGGER = LogManager.getLogger();

    private final Status info;

    public ConnectionException(Status info) {
        this.info = info;
    }

    @Override
    public void printStackTrace() {
        LOGGER.info(info.getTitle());
    }
}
