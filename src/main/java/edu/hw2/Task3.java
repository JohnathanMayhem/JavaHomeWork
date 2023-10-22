package edu.hw2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task3 {

    @SuppressWarnings("MagicNumber")
    public void exampleLaunch() {
        PopularCommandExecutor popularCommandExecutor =
            new PopularCommandExecutor(new DefaultConnectionManager(), 3);
        LOGGER.info("Start default");
        popularCommandExecutor.updatePackages();
    }

    @SuppressWarnings("MagicNumber")
    public void faultyLaunch() {
        PopularCommandExecutor popularCommandExecutor =
            new PopularCommandExecutor(new FaultyConnectionManager(), 3);
        LOGGER.info("Start faulty");
        popularCommandExecutor.updatePackages();
    }

    protected final static double CHANCE = 0.5;

    public Task3() {

    }

    private final static Logger LOGGER = LogManager.getLogger();

    public interface Connection extends AutoCloseable {
        void execute(String command);
    }

    public interface ConnectionManager {

        Connection getConnection();

    }

    public static class StableConnection implements Connection {

        @Override
        public void execute(String command) {
            LOGGER.info(Status.CONNECTION_SUCSESS.getTitle());
        }

        @Override
        public void close() {
            LOGGER.info(Status.CONECTION_CLOSED.getTitle());
        }
    }

    public static class FaultyConnection implements Connection {

        private double failChanse = CHANCE;

        @Override
        public void execute(String command) {
            if (Math.random() <= failChanse) {
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

    public static class ConnectionException extends RuntimeException {

        private final Status info;

        public ConnectionException(Status info) {
            this.info = info;
        }

        @Override
        public void printStackTrace() {
            LOGGER.info(info.getTitle());
        }
    }

    public static class DefaultConnectionManager implements ConnectionManager {
        private final double failChance;

        public DefaultConnectionManager() {
            this.failChance = CHANCE;
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

    public static class FaultyConnectionManager implements ConnectionManager {

        @Override
        public Connection getConnection() {
            return new FaultyConnection();
        }
    }

    public final class PopularCommandExecutor {
        private final ConnectionManager manager;
        private final int maxAttempts;

        public PopularCommandExecutor(ConnectionManager manager, int maxAttempts) {
            this.manager = manager;
            this.maxAttempts = maxAttempts;
        }

        public void updatePackages() {
            tryExecute("apt update && apt upgrade -y");
        }

        @SuppressWarnings("RegexpSinglelineJava")
        void tryExecute(String command) throws ConnectionException {
            int attemptsLeft = maxAttempts;
            while (attemptsLeft != 0) {
                LOGGER.info(Status.ATTEMPTS_LEFT.getTitle().formatted(attemptsLeft));
                try (Connection connection = manager.getConnection()) {
                    connection.execute(command);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                attemptsLeft--;
            }
            if (attemptsLeft == 0) {
                throw new ConnectionException(Status.NO_ATTEMPTS);
            }
        }
    }

}
