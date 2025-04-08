package com.uerj.calculadora_ingressos_zoo.domain;

import java.util.Scanner;

public class Menu {
    public static int showMenu(Scanner scanner) {
        System.out.println("\n============================");
        System.out.println("1 - Realizar novo cálculo");
        System.out.println("2 - Sair");
        System.out.println("============================");
        System.out.print("Escolha uma opção: ");

        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
