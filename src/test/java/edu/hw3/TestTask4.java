package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestTask4 {
    @Test
    @DisplayName("Rome's numbers")
    void testCipher() {
        // given
        int[] numbers = {2, 12, 113, 1025, 1134};
        String[] res = {"II", "XII", "CXIII", "MXXV", "MCXXXIV"};

        String[] evenRes = new String[5];
        Task4 task4 = new Task4();
        // when
        for (int i = 0; i < 5; ++i) {
            evenRes[i] = task4.convertToRoman(numbers[i]);
        }

        // then
        assertThat(evenRes).isEqualTo(res);

    }
}
