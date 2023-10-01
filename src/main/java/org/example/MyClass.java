package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyClass {
    private static final Logger logger = LoggerFactory.getLogger(MyClass.class);

    public void doSomething() {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            logger.error("Виникла помилка ділення на нуль: " + e.getMessage(), e);
            logger.debug("This is a debug message");
            logger.warn("This is a warning message");
            logger.info("This is an info message");

        }
    }
}
