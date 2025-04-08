package com.uerj.calculadora_ingressos_zoo.domain;

import lombok.*;

import java.util.Scanner;

import static com.uerj.calculadora_ingressos_zoo.domain.utils.InputUtils.readValidatedInputInt;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TicketSystem {
    private int age;
    private int quantity;

    public void inputData(){
        Scanner scanner = new Scanner(System.in);

        this.age = readValidatedInputInt(scanner,"Entre com a idade dos visitantes: ", 0, 120);
        this.quantity = readValidatedInputInt(scanner,"Entre com a quantidade de ingressos: ", 1, 5);
    }

    public double calculateTicketPrice() {
        double ticketPrice = 0.0;

        if(this.quantity > 5){
            System.out.println("Máximo de 5 ingressos por pessoa. ALtere a quantidade.");
        }

        if (age <= 12) {
            ticketPrice = 10.0;
        } else if (age <= 59) {
            ticketPrice = 30.0;
        } else {
            ticketPrice = 15.0;
        }

        return ticketPrice * quantity;
    }
}
