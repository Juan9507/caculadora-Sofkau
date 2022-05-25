package com.sofkau.project;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger(Main.class.getName());

        logger.info("Ingrese el primer número: ");
        String valueA=scanner.nextLine();

        logger.info("Ingrese el segundo número: ");
        String valueB=scanner.nextLine();

        logger.info("Ingrese operación que desee realizar: " +
                "\n+: suma\n-: resta\n/: división\n*: multiplicación");
        String operation=scanner.nextLine();
    }
}