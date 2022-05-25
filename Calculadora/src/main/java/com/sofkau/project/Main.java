package com.sofkau.project;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * [
 *  Taller pair programming de una calculadora simple
 *      - ingresar los numeros y elegir el operador
 * ]
 * 
 * 
 * @author [Juan David rivera] - [Sebastian Barrera]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Main {
    
    /**
     * Metodo principal para compilar el programar
     * @param args 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger(Main.class.getName());
        float result;
        logger.info("Ingrese el primer numero (A): ");
        String valueA = scanner.nextLine();

        logger.info("Ingrese el segundo numero (B): ");
        String valueB = scanner.nextLine();

        logger.info("Ingrese operacion que desee realizar: "
                + "\n+: suma (A + B)\n-: resta (A - B)\n"
                + "/: division (A / B)\n*: multiplicacion (A * B)");
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
        logger.info(() -> "La operacion realizada fue: " + valueA + operation + valueB);
        logger.info(() -> "El resultado es: " + result);
    }
}
