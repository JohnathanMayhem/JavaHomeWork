package edu.hw3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestTask2 {
    private final static Logger LOGGER = LogManager.getLogger();
    @Test
    @DisplayName("Brackets")
    void testCipher() {

        // given
        ArrayList<String> brackets = new ArrayList<>();
        brackets.add("()()()");
        brackets.add("((()))");
        brackets.add("((()))(())()()(()())");
        brackets.add("((())())(()(()()))");
        ArrayList<List<String>> res =
            new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList("()", "()", "()")),
                new ArrayList<>(Arrays.asList("((()))")),
                new ArrayList<>(Arrays.asList("((()))", "(())", "()", "()", "(()())")),
                new ArrayList<>(Arrays.asList("((())())", "(()(()()))"))
            ));

        // when
        ArrayList<List<String>> evenRes = new ArrayList<>();
        for (String str: brackets) {
            try {
                evenRes.add(Task2.clusterize(str));
            } catch (RuntimeException e){
                e.printStackTrace();
            }
        }
        // then
        assertThat(evenRes).isEqualTo(res);
    }
}
