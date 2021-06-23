package com.tutrit.java.quickstart.test;

import com.tutrit.java.quickstart.service.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorServiceTest {

    Logger logger = LoggerFactory.getLogger(CalculatorServiceTest.class);

    public static int totalTest = 0;
    public static int testFailed = 0;
    public static int testSuccess = 0;

    public void run() throws Exception {
        try {
            totalTest++;
            sum();
            testSuccess++;
        } catch (Exception e) {
            testFailed++;
            e.printStackTrace();
        }
        try {
            totalTest++;
            sub();
            testSuccess++;
        } catch (Exception e) {
            testFailed++;
            e.printStackTrace();
        }
        logger.info("totalTest = {}", totalTest);
        logger.info("testSuccess = {}", testSuccess);
        logger.info("testFailed = {}", testFailed);
        if(testFailed != 0){
            throw new Exception("Build failed");
        }
    }

    public void sum() throws Exception {
        CalculatorService calculatorService = new CalculatorService();
        int a = 1;
        int b = 3;
        int actual = calculatorService.sum(a, b);
        int expected = 4;
        assertEquals(actual, expected);

    }

    public void sub() throws Exception {
        CalculatorService calculatorService = new CalculatorService();
        int a = 1;
        int b = 3;
        int actual = calculatorService.sub(a, b);
        int expected = -2;
        assertEquals(actual, expected);
    }

    private void assertEquals(int actual, int expected) throws Exception {
        if (expected == actual) {
            logger.info("test success");
        } else {
            throw new Exception("test failed");
        }
    }

}
