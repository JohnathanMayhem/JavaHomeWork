package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SampleTest {
    @Test
    @DisplayName("Фильтрация четных чисел")
    void filterEvenNumbers() {
        // given
        int[] numbers = new int[] {1, 2, 3, 4, 5};

        // when
        int[] evenNumbers = EvenArrayUtils.filter(numbers);

        // then
        assertThat(evenNumbers)
            .containsExactly(2, 4)
            .hasSize(2);
    }

    @Test
    @DisplayName("Проверка времени")
    void checkTime() {
        // given
        String[] times = new String[] {"01:00", "13:56", "10:60", "10", "20:30:50", "234:0", ""};

        int[] timeReal = new int[] {60, 836, -1, -1, -1, 14040, -1};

        // when
        int[] evenTimes = new int[7];
        int i = 0;
        for (String s : times) {
            evenTimes[i] = Task1.minutesToSeconds(s);
            ++i;
        }
        // then
        assertThat(evenTimes)
            .isEqualTo(timeReal);

    }

    @Test
    @DisplayName("Проверка количества чисел")
    void checkNumbers() {
        // given
        int[] numbersReal = new int[] {1, 1, 2, 3, 4};
        int[] testNumbers = new int[] {0, 1, 22, 234, 1050};
        // when
        int[] evenNumbers = new int[5];
        int i = 0;
        for (int num : testNumbers) {
            evenNumbers[i] = Task2.countDigits(num);
            ++i;
        }
        // then
        assertThat(evenNumbers)
            .isEqualTo(numbersReal);

    }

    @Test
    @DisplayName("Проверка вхождения массива")
    void checkNest() {
        // given
        int[][][] arrs =
            new int[][][] {{{1, 2, 3, 4}, {0, 6}}, {{3, 1}, {4, 0}}, {{9, 9, 8}, {8, 9}}, {{1, 2, 3, 4}, {2, 3}}};
        boolean[] ans = new boolean[] {true, true, false, false};
        boolean[] evenRes = new boolean[4];
        for (int i = 0; i < 4; i++) {
            evenRes[i] = Task3.isNestable(arrs[i][0], arrs[i][1]);
        }
        // then
        assertThat(evenRes)
            .isEqualTo(ans);

    }

    @Test
    @DisplayName("Проверка строк")
    void checkStrings() {
        // given
        String[] strings = new String[] {"123456", "hTsii  s aimex dpus rtni.g", "badce"};
        String[] res = new String[] {"214365", "This is a mixed up string.", "abcde"};
        String[] evenRes = new String[3];
        for (int i = 0; i < 3; i++) {
            evenRes[i] = Task4.fixString(strings[i]);
        }
        // then
        assertThat(evenRes)
            .isEqualTo(res);

    }

    @Test
    @DisplayName("Проверка полиндрома")
    void checkPolindrome() {
        // given
        int[] numers = new int[] {11211230, 13001120, 23336014, 11, 989998, 12345};
        boolean[] res = new boolean[] {true, true, true, true, true, false};
        boolean[] evenRes = new boolean[6];
        for (int i = 0; i < 6; i++) {
            evenRes[i] = Task5.isPalindrome(numers[i]);
        }
        // then
        assertThat(evenRes)
            .isEqualTo(res);

    }

    @Test
    @DisplayName("Проверка функции Каприкара")
    void checkKap() {
        // given
        int[] numers = new int[] {6621, 6554, 1234, 1000};
        int[] res = new int[] {5, 4, 3, -1};
        int[] evenRes = new int[4];
        for (int i = 0; i < 4; i++) {
            evenRes[i] = Task6.countK(numers[i]);
        }
        // then
        assertThat(evenRes)
            .isEqualTo(res);

    }

    @Test
    @DisplayName("Проверка Сдвига")
    void checkShift() {
        // given
        int[][] numers = new int[][] {{8, 1}, {16, 1}, {17, 2}};
        int[] res = new int[] {4, 1, 6};
        int[] evenRes = new int[3];
        evenRes[0] = Task7.rotateRight(numers[0][0], numers[0][1]);
        for (int i = 1; i < 3; i++) {
            evenRes[i] = Task7.rotateLeft(numers[i][0], numers[i][1]);
        }
        // then
        assertThat(evenRes)
            .isEqualTo(res);

    }

    @Test
    @DisplayName("Проверка коней")
    void checkBoard() {
        // given
        int[][][] boards = new int[][][] {
            {
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 1, 0},
                {0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1, 0, 0, 0}
            },
            {
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0, 1, 0, 1}
            },
            {
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0}
            }
        };
        boolean[] res = new boolean [] {true, false, false};
        boolean[] evenRes = new boolean[3];
        for (int i = 0; i < 3; i++) {
            evenRes[i] = Task8.knightBoardCapture(boards[i]);
        }

        // then
        assertThat(evenRes)
            .isEqualTo(res);

    }
}
