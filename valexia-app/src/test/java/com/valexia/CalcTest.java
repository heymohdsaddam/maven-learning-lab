package com.valexia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    void testCalc() {
        Calc calc = new Calc();
        int actualResult = calc.addition(5, 7);
        int expectedResult = 12;
        assertEquals(expectedResult, actualResult);
    }
}
