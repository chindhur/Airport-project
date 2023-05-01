package com.utils;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Printer {

    private static final Logger logger = LogManager.getLogger(Printer.class);

    public static void print(String out) {
        logger.info("AIRPORT: " + out);
    }

    public static void print(int out) {
        logger.info("AIRPORT: " + out);
    }

    public static void error(String out) {
        logger.error("ERROR: " + out);
    }

    public static void debug(String out) {
        logger.debug(out);
    }

}