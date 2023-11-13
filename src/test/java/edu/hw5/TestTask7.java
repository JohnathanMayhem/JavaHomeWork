package edu.hw5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestTask7 {
    @Test
    public void testSubTask1() {
        assertTrue(Task7.subTask1("1000"));

        assertFalse(Task7.subTask1("10101"));

        assertFalse(Task7.subTask1(""));

        assertFalse(Task7.subTask1("0110"));
    }

    @Test
    public void testSubTask2() {
        // Строка "010" соответствует шаблону
        assertTrue(Task7.subTask2("010"));

        assertFalse(Task7.subTask2("001"));

        assertFalse(Task7.subTask2(""));

        assertTrue(Task7.subTask2("10101"));
    }

    @Test
    public void testSubTask3() {

        assertTrue(Task7.subTask3("0"));

        assertTrue(Task7.subTask3("111"));

        assertFalse(Task7.subTask3(""));

        assertFalse(Task7.subTask3("1011"));
    }
}
