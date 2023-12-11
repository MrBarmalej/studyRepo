package Lesson34;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public int plus(int a, int b) {
        int result = a + b;
        logger.info("Adding "+a+" by "+b+" gives result: "+result);
        return result;
    }

    public int minus(int a, int b) {
        int result = a - b;
        logger.info("Subtracting "+a+" by "+b+" gives result: "+result);
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        logger.info("Multiplying "+a+" by "+b+" gives result: "+result);
        return result;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            logger.error("Cannot divide by zero");
            throw new ArithmeticException("Cannot divide by zero");
        }

        int result = a / b;
        logger.info("Dividing "+a+" by "+b+" gives result: "+result);
        return result;
    }
}

