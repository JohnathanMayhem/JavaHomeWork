package edu.hw3;


import edu.hw3.Task7.NullHandlingComparator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.TreeMap;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class TestTask7 {

    @Test
    @DisplayName("Rome's numbers")
    void testCipher() {
        // given
        NullHandlingComparator comparator = new NullHandlingComparator();

        TreeMap<String, String> tree = new TreeMap<>(comparator);
        tree.put(null, "test");

        // then
        assertThat(tree.containsKey(null)).isTrue();

    }


}
