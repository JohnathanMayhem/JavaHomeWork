package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTask6 {
    @Test
    @DisplayName("Test for substrings")
    void filterEvenNumbers() {
        // given
        assertTrue(Task6.isSubstringOfString("01", "1010101"));

        // Подстрока "11" отсутствует в строке "1010101"
        assertFalse(Task6.isSubstringOfString("11", "1010101"));

        // Подстрока "0" присутствует в строке "10001"
        assertTrue(Task6.isSubstringOfString("0", "10001"));

        // Подстрока "101" отсутствует в строке "11111"
        assertFalse(Task6.isSubstringOfString("101", "11111"));
    }
}
