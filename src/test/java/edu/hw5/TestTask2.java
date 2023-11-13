package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.LongAccumulator;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestTask2 {

    @Test
    @DisplayName("Fridays")
    void filterEvenNumbers() {
        // given
        int year = 1925;
        List<LocalDate> expected = new ArrayList<>(Arrays.asList(LocalDate.of(1925, 02, 13),
            LocalDate.of(1925, 03, 13),
            LocalDate.of(1925, 11, 13)
        ));

        // when
        List<LocalDate> res = Task2.fridaysThirteen(year);
        LocalDate now = LocalDate.now();
        LocalDate closestFriday = LocalDate.of(2024, 9, 13);

        // then
        assertThat(res).isEqualTo(expected);
        assertThat(Task2.closeFridayTriteen(now)).isEqualTo(closestFriday);

    }
}
