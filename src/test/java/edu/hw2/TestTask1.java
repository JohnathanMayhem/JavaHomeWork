package edu.hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestTask1 {
    @Test
    @DisplayName("Проверка вычислений")
    void calculate() {
        // given
        //int[] numbers = new int[] {1, 2, 3, 4, 5};
        var two = new Task1.Expr.Constant(2);
        var four = new Task1.Expr.Constant(4);
        var negOne = new Task1.Expr.Negate(new Task1.Expr.Constant(1));
        var sumTwoFour = new Task1.Expr.Addition(two, four);
        var mult = new Task1.Expr.Multiplication(sumTwoFour, negOne);
        var exp = new Task1.Expr.Exponent(mult, 2);
        var res = new Task1.Expr.Addition(exp, new Task1.Expr.Constant(1));
        // when
        double evenRes = 37.0;
        double result = res.evaluate();
        // then
        assertThat(result).isEqualTo(evenRes);
    }
}
