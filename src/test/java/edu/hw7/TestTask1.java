package edu.hw7;

import edu.hw7.Task1.Incrementer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestTask1 {
    @Test
    @DisplayName("Incremenring")
    void testingIncrement() {
        Incrementer inc1 = new Incrementer(0);
        // then
        assertThat(Incrementer.incrementWithThreads(inc1, 4)).isEqualTo(4);
        Incrementer inc2 = new Incrementer(20);
        // then
        assertThat(Incrementer.incrementWithThreads(inc2, 10)).isEqualTo(30);
    }
}
