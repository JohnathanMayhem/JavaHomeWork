package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestTask5 {
    @Test
    @DisplayName("Test for checking numbers")
    void filterEvenNumbers() {
        // given
        List<String> numbers = new ArrayList<>(Arrays.asList("А123ВЕ777", "О777ОО177", "123АВЕ777", "А123ВГ77", "А123ВЕ7777"));
        List<Boolean> result = new ArrayList<>();
        for (String pasword: numbers) {
            result.add(Task5.isValidNumber(pasword));
        }

        // then
        assertThat(result).isEqualTo(new ArrayList<>(Arrays.asList(true, true, false, false, false)));

    }
}
