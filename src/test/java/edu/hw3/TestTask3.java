package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestTask3 {
    @Test
    @DisplayName("CounterTable")
    void testCipher() {
        // given
        List<Object> stringTest1 = new ArrayList<>(Arrays.asList("a", "bb", "a", "bb"));
        List<Object> stringTest2 = new ArrayList<>(Arrays.asList("this", "and", "that", "and"));
        List<Object> stringTest3 = new ArrayList<>(Arrays.asList("код", "код", "код", "bug"));
        List<Object> integerTest = new ArrayList<>(Arrays.asList(1, 1, 2, 2));

        HashMap<String, Integer> resTask1 = new HashMap<>();
        resTask1.put("a", 2);
        resTask1.put("bb", 2);
        HashMap<String, Integer> resTask2 = new HashMap<>();
        resTask2.put("this", 1);
        resTask2.put("that", 1);
        resTask2.put("and", 2);
        HashMap<String, Integer> resTask3 = new HashMap<>();
        resTask3.put("код", 3);
        resTask3.put("bug", 1);
        HashMap<Integer, Integer> resTask4 = new HashMap<>();
        resTask4.put(1, 2);
        resTask4.put(2, 2);
        // then
        assertThat(Task3.freqDict(stringTest1)).isEqualTo(resTask1);
        assertThat(Task3.freqDict(stringTest2)).isEqualTo(resTask2);
        assertThat(Task3.freqDict(stringTest3)).isEqualTo(resTask3);
        assertThat(Task3.freqDict(integerTest)).isEqualTo(resTask4);
    }
}
