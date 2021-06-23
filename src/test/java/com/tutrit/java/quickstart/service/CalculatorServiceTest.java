package com.tutrit.java.quickstart.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorServiceTest {

    CalculatorService calculatorService;

    @Before
    public void setUp(){
        calculatorService = new CalculatorService();
    }

    @Test
    public void sumPositive() {
        int a = 1;
        int b = 3;
        int actual = calculatorService.sum(a, b);
        int expected = 4;
        //boolean result = actual == expected;
        //assertTrue(result);
        assertEquals(actual, expected);
    }

    @Test
    public void sumNegative() {
        int a = 1;
        int b = 2;
        int actual = calculatorService.sum(a, b);
        int expected = 4;
        //boolean result = actual == expected;
        //assertFalse(result);
        assertNotEquals(actual, expected);
    }

    @Test
    public void subPositive() {
        int a = 1;
        int b = 3;
        int actual = calculatorService.sub(a, b);
        int expected = -2;
        assertEquals(expected, actual);
    }

    @Test
    public void subNegative() {
        int a = 1;
        int b = 2;
        int actual = calculatorService.sub(a, b);
        int expected = -2;
        assertNotEquals(expected, actual);
    }

    @Test
    public void divPositive(){
        int a = 8;
        int b = 2;
        int expected = 4;
        int actual = calculatorService.div(a,b);
        assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void divByZero(){
        int a = 8;
        int b = 0;
        int actual = calculatorService.div(a,b);
    }
}