package com.vivek.test;

import org.apache.log4j.Logger; import org.apache.log4j.PropertyConfigurator;

public class Log4jDemo {

    static final Logger logger = Logger.getLogger(Log4jDemo.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("C:/Users/Vivek/Desktop/MyWorkspace/MySpringProject/src/log4j.properties");
        logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
    }
}
