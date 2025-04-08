package com.uerj.calculadora_ingressos_zoo;

import com.uerj.calculadora_ingressos_zoo.domain.TicketSystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

import static com.uerj.calculadora_ingressos_zoo.domain.Menu.showMenu;

@SpringBootApplication
public class CalculadoraIngressosZooApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculadoraIngressosZooApplication.class, args);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Ingressos do ZOO UERJ - Teste de Software 25.1");

        while(true){
            int option = showMenu(scanner);

            switch (option){
                case 1:
                    TicketSystem ticketSystem = new TicketSystem();

                    ticketSystem.inputData();
                    double totalPrice = ticketSystem.calculateTicketPrice();
                    System.out.printf("O preço total dos ingressos é: R$ %.2f%n", totalPrice);

                    break;
                case 2:
                    System.out.println("Encerrando o programa. Até mais!");
                    return;
                default:
                    System.out.println("Opção inválida! Escolha 1 ou 2.");
            }
        }
    }

}
