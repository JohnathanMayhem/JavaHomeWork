package edu.hw2;

public enum Status {
    CONNECTION_SUCSESS("Connection was successful"),
    ATTEMPTS_LEFT("Attempts lefted: %d"),
    CONNECTION_FAILED("Connection was failed"),
    CONECTION_CLOSED("Connection was closed"),
    NO_ATTEMPTS("No attempts left"),
    EXECUTION_FAILED("Command execution has been failed");

    private String info;

    Status(String info) {
        this.info = info;
    }

    public String getTitle() {
        return info;
    }
}
