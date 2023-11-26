package edu.hw7;

import edu.hw7.Task2.FactorialCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestTask2 {
    @Test
    @DisplayName("Factorial")
    void testingIncrement() {
        int num = 10;
        // then
        assertThat(FactorialCalculator.factorial(num)).isEqualTo(new BigInteger("3628800"));
        num = 0;
        assertThat(FactorialCalculator.factorial(num)).isEqualTo(BigInteger.ONE);
    }
}
