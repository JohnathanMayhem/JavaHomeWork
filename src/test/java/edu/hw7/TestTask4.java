package edu.hw7;

import edu.hw7.Task4.MethodMontecarlo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTask4 {
    @Test
    @DisplayName("Factorial")
    void testingIncrement() {
        double pi = MethodMontecarlo.pi(349548738);
        assertTrue(pi > 3.14 && pi < 3.2);
    }
}
