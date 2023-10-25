package edu.hw2.task3;

import edu.hw2.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class PopularCommandExecutor {

    private final static Logger LOGGER = LogManager.getLogger();
    private final ConnectionManager manager;
    private final int maxAttempts;

    public PopularCommandExecutor(ConnectionManager manager, int maxAttempts) {
        this.manager = manager;
        this.maxAttempts = maxAttempts;
    }

    @SuppressWarnings("RegexpSinglelineJava")
    public void updatePackages() {
        try {
            tryExecute("apt update && apt upgrade -y");
        } catch (ConnectionException ex) {
            ex.printStackTrace();
        }

    }

    @SuppressWarnings("RegexpSinglelineJava")
    void tryExecute(String command) throws ConnectionException {
        int attemptsLeft = maxAttempts;
        while (attemptsLeft != 0) {
            LOGGER.info(Status.ATTEMPTS_LEFT.getTitle().formatted(attemptsLeft));
            try (Connection connection = manager.getConnection()) {
                connection.execute(command);
                break;
            } catch (ConnectionException e) {
                if (attemptsLeft == 1) {
                    throw e;
                }
                e.printStackTrace();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            attemptsLeft--;
        }
    }
}
