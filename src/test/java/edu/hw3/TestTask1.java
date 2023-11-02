package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestTask1 {
    @Test
    @DisplayName("Cipher")
    void testCipher() {
        // given
        String s = "Hello world!";
        String res = "Svool dliow!";

        // when
        Task1 task1 = new Task1();


        // then
        assertThat(task1.atbash(s)).isEqualTo(res);
    }
}
