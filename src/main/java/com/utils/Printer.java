package com.utils;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

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

    public static void printFile(String outputFile, Set<String> printWords)  {
        try {
            FileWriter fileWriter = new FileWriter(outputFile);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(printWords);
            printWriter.close();
        } catch (IOException e) {
            error("Print Error : " + e.getMessage());
        }
    }
}