package com.testing;

import com.testing.calculator.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(10, calc.add(5, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(0, calc.subtract(5, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(25, calc.multiply(5, 5));
    }

    @Test
    void testDivide() {
        assertEquals(1, calc.divide(5, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 10})
    void testIsEven(int num) {
        Assertions.assertTrue(calc.isEven(num));
    }
}
