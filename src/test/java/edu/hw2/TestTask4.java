package edu.hw2;

import edu.hw2.Main2;
import edu.hw2.Task4;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTask4 {
    @BeforeEach
    void setUp() {
        problem4 = new Task4();
    }

    private Task4 problem4;

    @Test
    void firstTest() {
        String result = problem4.problem4();
        Assertions.assertThat(result).isEqualTo("""
            Class name: edu.hw2.Problem4
            Method name: problem4
            """);
    }

    @Test
    void doubleTest() {
        String result = problem4.doubleProblem4();
        Assertions.assertThat(result).isEqualTo("""
            Class name: edu.hw2.Problem4
            Method name: problem4
            Class name: edu.hw2.Problem4
            Method name: doubleProblem4
            """);
    }

    @Test
    void mainTest() {
        String result = Main2.mainFourTest();
        Assertions.assertThat(result).isEqualTo("""
            Class name: edu.hw2.Main
            Method name: mainFourTest
            """);
    }
}
