package edu.hw3;

import edu.hw3.Task6.Stock;
import edu.hw3.Task6.StockMarket;
import edu.hw3.Task8.BackwardIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestTask8 {
    @Test
    @DisplayName("Backward Iterator")
    void testCipher() {
        // given
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
        BackwardIterator<Integer> iterator = new BackwardIterator<>(numbers);
        ArrayList<Integer> arrRes = new ArrayList<>(Arrays.asList(3, 2, 1));
        ArrayList<Integer> evenArrRes = new ArrayList<>();
        while (iterator.hasNext()) {
            evenArrRes.add(iterator.next());
        }

        //Contact res =
        // then

        assertThat(evenArrRes).isEqualTo(arrRes);
    }

}
