package edu.hw2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task1 {

    private final static Logger LOGGER = LogManager.getLogger();

    private Task1() {

    }

    public sealed interface Expr {
        double evaluate();

        record Constant(double value) implements Expr {
            @Override
            public String toString() {
                return (String.valueOf(this.value));
            }

            @Override
            public double evaluate() {
                return value;
            }
        }

        record Negate(Expr value) implements Expr {
            @Override
            public String toString() {
                return ("(" + String.valueOf(this.evaluate()) + ")");
            }

            @Override
            public double evaluate() {
                return (-value.evaluate());
            }
        }

        public record Exponent(Expr value, double power) implements Expr {
            @Override
            public String toString() {
                return ("(" + value().toString() + "^(" + String.valueOf(power) + ")" + ")");
            }

            @Override
            public double evaluate() {
                return Math.pow(value.evaluate(), power);
            }
        }

        public record Addition(Expr value1, Expr value2) implements Expr {
            @Override
            public String toString() {
                return ("(" + value1.toString() + "+" + value2.toString() + ")");
            }

            @Override
            public double evaluate() {
                return (value1.evaluate() + value2.evaluate());
            }
        }

        public record Multiplication(Expr value1, Expr value2) implements Expr {
            @Override
            public String toString() {
                return ("(" + value1.toString() + "*" + value2.toString() + ")");
            }

            @Override
            public double evaluate() {
                return (value1.evaluate() * value2.evaluate());
            }
        }
    }

}
