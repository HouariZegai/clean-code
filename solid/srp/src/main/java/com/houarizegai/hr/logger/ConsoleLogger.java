package com.houarizegai.hr.logger;

import java.util.logging.Logger;

public class ConsoleLogger {

    private static final Logger logger = Logger.getLogger(ConsoleLogger.class.getName());

    public static void info(String msg) {
        logger.info(msg);
    }

    public static void error(String msg) {
        logger.info(msg);
    }
}
