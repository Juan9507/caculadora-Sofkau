package com.sofkau.project;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger(Main.class.getName());
        float result;
        logger.info("Ingrese el primer número (A): ");
        String valueA = scanner.nextLine();

        logger.info("Ingrese el segundo número (B): ");
        String valueB = scanner.nextLine();

        logger.info("Ingrese operación que desee realizar: "
                + "\n+: suma (A + B)\n-: resta (A - B)\n"
                + "/: división (A / B)\n*: multiplicación (A * B)");
        String operation = scanner.nextLine();

        switch (operation) {
            case "+":
                result = Float.parseFloat(valueA) + Float.parseFloat(valueB);
                break;
            case "-":
                result = Float.parseFloat(valueA) - Float.parseFloat(valueB);
                break;
            case "/":
                result = Float.parseFloat(valueA) / Float.parseFloat(valueB);
                break;
            case "*":
                result = Float.parseFloat(valueA) * Float.parseFloat(valueB);
                break;
            default:
                result = 0;
        }
        
        logger.info(() -> "El resultado es: " + result);
    }
}
