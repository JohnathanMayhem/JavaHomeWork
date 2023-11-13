package edu.hw5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTask8 {
    @Test
    public void testSubTask1() {
        assertFalse(Task8.subTask1("010101"));

        assertTrue(Task8.subTask1("01010"));

        assertFalse(Task8.subTask1(""));

        assertFalse(Task8.subTask1("101010"));
    }

    @Test
    public void testSubTask2() {
        assertFalse(Task8.subTask2("0101"));

        assertFalse(Task8.subTask2("0011"));

        assertTrue(Task8.subTask2("101010"));
    }

    @Test
    public void testSubTask3() {
        assertFalse(Task8.subTask3("0101010101"));

        assertFalse(Task8.subTask3("01111"));

        assertTrue(Task8.subTask3("010101"));
    }

    @Test
    public void testSubTask4() {
        assertTrue(Task8.subTask4("010101"));

        assertTrue(Task8.subTask4("0101"));

        assertFalse(Task8.subTask4("111111"));
    }

    @Test
    public void testSubTask5() {
        assertFalse(Task8.subTask5("0101"));

        assertFalse(Task8.subTask5("0011"));

        assertTrue(Task8.subTask5("101010"));
    }

    @Test
    public void testSubTask7() {
        assertTrue(Task8.subTask7("0101010101"));

        assertFalse(Task8.subTask7("1111"));

        assertTrue(Task8.subTask7(""));

        assertTrue(Task8.subTask7("010101"));
    }
}
