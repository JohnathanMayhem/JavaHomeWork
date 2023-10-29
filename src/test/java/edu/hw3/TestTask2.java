package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestTask2 {
    @Test
    @DisplayName("Brackets")
    void testCipher() {
        // given
        ArrayList<String> brackets = new ArrayList<>();
        brackets.add("()()()");
        brackets.add("((()))");
        brackets.add("((()))(())()()(()())");
        brackets.add("((())())(()(()()))");
        ArrayList<ArrayList<String>> res =
            new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList("()", "()", "()")),
                new ArrayList<>(Arrays.asList("((()))")),
                new ArrayList<>(Arrays.asList("((()))", "(())", "()", "()", "(()())")),
                new ArrayList<>(Arrays.asList("((())())", "(()(()()))"))
            ));

        // when
        ArrayList<ArrayList<String>> evenRes = new ArrayList<>();
        for (String str: brackets) {
            evenRes.add(Task2.clusterize(str));
        }
        // then
        assertThat(evenRes).isEqualTo(res);
    }
}
