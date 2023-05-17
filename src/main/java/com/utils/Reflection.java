package com.utils;

import com.airport.AirplaneEmployee;
import java.lang.reflect.*;

public class Reflection {
    public static void printClassDetails(String className) throws ClassNotFoundException {
        Class classRef = Class.forName(className);
        Constructor[] constructors = classRef.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            Printer.print("Constructor  Name : " + constructor);
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                Printer.print("Constructor's parameter : " + parameter);
            }
        }

        Method[] methods = classRef.getDeclaredMethods();
        for (Method method : methods) {
            Printer.print("Method name: " + method);
            Printer.print("Method return type : " + method.getReturnType());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                Printer.print("Method's Parameter : " + parameter);
            }
        }
    }

    public static void printEmployeeValues(AirplaneEmployee emp, String[] props) {
        try {
            for (int i = 0; i < props.length; i++) {
                // Get the method associated with this property
                Method method = emp.getClass() //AirplaneEmployee
                        .getSuperclass() // Employee
                        .getSuperclass()  // Person
                        .getDeclaredMethod("get" + props[i]);
                // invoke the method and
                Printer.print(props[i] + " value is " + method.invoke(emp).toString());
            }
        } catch (Exception e) {
            // print the error stack trace
            Printer.print("Error " + e.getMessage() + " Error stack follows \n");
            e.printStackTrace();
        }
    }
}
