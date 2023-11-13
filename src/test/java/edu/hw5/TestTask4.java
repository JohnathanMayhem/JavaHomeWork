package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestTask4 {
    @Test
    @DisplayName("Fridays")
    void filterEvenNumbers() {
        // given
        List<String> passwords = new ArrayList<>(Arrays.asList("Legolas123", "Password!", "bla~bla!"));
        List<Boolean> result = new ArrayList<>();
        for (String pasword: passwords) {
            result.add(Task4.hasNessesarySympol(pasword));
        }

        // then
        assertThat(result).isEqualTo(new ArrayList<>(Arrays.asList(false, true, true)));


    }
}
