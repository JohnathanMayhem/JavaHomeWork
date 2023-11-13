package edu.hw5;

import edu.hw1.EvenArrayUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestTask1 {

    @Test
    @DisplayName("Duration")
    void filterEvenNumbers() {
        // given
        List<String> given = new ArrayList<>(Arrays.asList("2022-03-12, 20:20 - 2022-03-12, 23:50", "2022-04-01, 21:30 - 2022-04-02, 01:20"));

        // when
        String answ = "3ч 40м";

        // then
        assertThat(Task1.meanDuration(given)).isEqualTo(answ);
    }
}
