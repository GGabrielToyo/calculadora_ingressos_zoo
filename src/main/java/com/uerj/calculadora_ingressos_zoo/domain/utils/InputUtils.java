package com.uerj.calculadora_ingressos_zoo.domain.utils;

import java.util.Scanner;

public class InputUtils {
    public static int readValidatedInputInt(Scanner scanner, String message, int min, int max) {
        int value = -1;
        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine();

                value = Integer.parseInt(input);

                if (value < min || value > max) {
                    throw new IllegalArgumentException("Valor fora do intervalo permitido [" + min + " a " + max + "]");
                }

                return value;

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
