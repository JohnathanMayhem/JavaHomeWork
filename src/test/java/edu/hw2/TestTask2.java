package edu.hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestTask2 {
    @Test
    @DisplayName("Проверка прямоугольника")
    void checkRectArea() {
        Rectangle rect = new Rectangle(10, 20);
        assertThat(rect.area()).isEqualTo(200);
    }

    @Test
    @DisplayName("Проверка квадрата")
    void checkSquareArea() {
        Square rect = new Square(20);
        rect.setHeight(10);
        assertThat(rect.area()).isEqualTo(100);
    }

}
