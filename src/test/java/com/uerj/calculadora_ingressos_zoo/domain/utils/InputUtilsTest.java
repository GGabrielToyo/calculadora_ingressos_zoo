package com.uerj.calculadora_ingressos_zoo.domain.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static com.uerj.calculadora_ingressos_zoo.domain.utils.InputUtils.readValidatedInputInt;
import static org.junit.jupiter.api.Assertions.*;

class InputUtilsTest {

    @Test
    @DisplayName("[Teste da variável IDADE] Deve lançar exception quando valor da idade for -1")
    void readValidatedInputIntScenario1() {
        // Entrada inválida com -1 e depois uma entrada válida para sair do loop
        String simulatedInput = "-1\n3\n";
        //Simula a entrada do usuário com valor -1 e depois 3
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner scanner = new Scanner(in);

        // Captura a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        int result = readValidatedInputInt(scanner,"Entre com a idade dos visitantes: ", 0, 120);

        // Restaura o System.out
        System.setOut(originalOut);

        // Valida o resultado final
        assertEquals(3, result);

        // Valida que as mensagens de erro foram exibidas
        String output = outContent.toString();

        assertTrue(output.contains("Valor fora do intervalo permitido [0 a 120]"));
    }

    @Test
    @DisplayName("[Teste da variável IDADE] Deve aceitar a entrada quando o valor da idade for 20")
    void readValidatedInputIntScenario2() {
        // Entrada válida com 20
        String simulatedInput = "20";
        //Simula a entrada do usuário com valor 20
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner scanner = new Scanner(in);

        // Captura a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        int result = readValidatedInputInt(scanner,"Entre com a idade dos visitantes: ", 0, 120);

        // Restaura o System.out
        System.setOut(originalOut);

        // Valida o resultado final
        assertEquals(20, result);

        // Valida que as mensagens de erro foram exibidas
        String output = outContent.toString();

        assertFalse(output.contains("Valor fora do intervalo permitido [0 a 120]"));
    }

    @Test
    @DisplayName("[Teste da variável IDADE] Deve aceitar a entrada quando o valor da idade for 88")
    void readValidatedInputIntScenario3() {
        // Entrada válida com 88
        String simulatedInput = "88";
        //Simula a entrada do usuário com valor 88
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner scanner = new Scanner(in);

        // Captura a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        int result = readValidatedInputInt(scanner,"Entre com a idade dos visitantes: ", 0, 120);

        // Restaura o System.out
        System.setOut(originalOut);

        // Valida o resultado final
        assertEquals(88, result);

        // Valida que as mensagens de erro foram exibidas
        String output = outContent.toString();

        assertFalse(output.contains("Valor fora do intervalo permitido [0 a 120]"));
    }

    @Test
    @DisplayName("[Teste da variável QUANTIDADE] Deve lançar exception quando valor da quantidade for 8")
    void readValidatedInputIntScenario4() {
        // Entrada inválida com 8 e depois uma entrada válida para sair do loop
        String simulatedInput = "8\n3\n";
        //Simula a entrada do usuário com valor 8 e depois 3
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner scanner = new Scanner(in);

        // Captura a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        int result = readValidatedInputInt(scanner,"Entre com a quantidade de ingressos: ", 1, 5);

        // Restaura o System.out
        System.setOut(originalOut);

        // Valida o resultado final
        assertEquals(3, result);

        // Valida que as mensagens de erro foram exibidas
        String output = outContent.toString();

        assertTrue(output.contains("Valor fora do intervalo permitido [1 a 5]"));
    }

    @Test
    @DisplayName("[Teste da variável QUANTIDADE] Deve aceitar a entrada quando o valor da quantidade for 2")
    void readValidatedInputIntScenario5() {
        // Entrada válida com 2
        String simulatedInput = "2";
        //Simula a entrada do usuário com valor 2
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner scanner = new Scanner(in);

        // Captura a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        int result = readValidatedInputInt(scanner,"Entre com a quantidade de ingressos: ", 1, 5);

        // Restaura o System.out
        System.setOut(originalOut);

        // Valida o resultado final
        assertEquals(2, result);

        // Valida que as mensagens de erro foram exibidas
        String output = outContent.toString();

        assertFalse(output.contains("Valor fora do intervalo permitido [1 a 5]"));
    }

    @Test
    @DisplayName("[Teste da variável QUANTIDADE] Deve aceitar a entrada quando o valor da quantidade for 5")
    void readValidatedInputIntScenario6() {
        // Entrada válida com 5
        String simulatedInput = "5";
        //Simula a entrada do usuário com valor 5
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner scanner = new Scanner(in);

        // Captura a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        int result = readValidatedInputInt(scanner,"Entre com a quantidade de ingressos: ", 1, 5);

        // Restaura o System.out
        System.setOut(originalOut);

        // Valida o resultado final
        assertEquals(5, result);

        // Valida que as mensagens de erro foram exibidas
        String output = outContent.toString();

        assertFalse(output.contains("Valor fora do intervalo permitido [1 a 5]"));
    }

    @Test
    @DisplayName("[Teste da variável IDADE - Valores Limite] Deve lançar exception quando valor limite for -1 e aceitar 0")
    void readValidatedInputIntScenario7() {
        // Entrada inválida com -1 e depois uma entrada válida para sair do loop
        String simulatedInput = "-1\n0\n";
        //Simula a entrada do usuário com valor -1 e 0
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner scanner = new Scanner(in);

        // Captura a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        int result = readValidatedInputInt(scanner,"Entre com a idade dos visitantes: ", 0, 120);

        // Restaura o System.out
        System.setOut(originalOut);

        // Valida o resultado final
        assertEquals(0, result);

        // Valida que as mensagens de erro foram exibidas
        String output = outContent.toString();

        assertTrue(output.contains("Valor fora do intervalo permitido [0 a 120]"));
    }

    @Test
    @DisplayName("[Teste da variável IDADE - Valores Limite] Deve lançar exception quando valor limite for 121 e aceitar 120")
    void readValidatedInputIntScenario8() {
        // Entrada inválida com 121 e depois uma entrada válida para sair do loop
        String simulatedInput = "121\n120\n";
        //Simula a entrada do usuário com valor 121 e 120
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner scanner = new Scanner(in);

        // Captura a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        int result = readValidatedInputInt(scanner,"Entre com a idade dos visitantes: ", 0, 120);

        // Restaura o System.out
        System.setOut(originalOut);

        // Valida o resultado final
        assertEquals(120, result);

        // Valida que as mensagens de erro foram exibidas
        String output = outContent.toString();

        assertTrue(output.contains("Valor fora do intervalo permitido [0 a 120]"));
    }

    @Test
    @DisplayName("[Teste da variável QUANTIDADE - Valores Limite] Deve lançar exception quando valor limite for 0 e aceitar 1")
    void readValidatedInputIntScenario9() {
        // Entrada inválida com 0 e depois uma entrada válida para sair do loop
        String simulatedInput = "0\n1\n";
        //Simula a entrada do usuário com valor 0 e 1
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner scanner = new Scanner(in);

        // Captura a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        int result = readValidatedInputInt(scanner,"Entre com a quantidade de ingressos: ", 1, 5);

        // Restaura o System.out
        System.setOut(originalOut);

        // Valida o resultado final
        assertEquals(1, result);

        // Valida que as mensagens de erro foram exibidas
        String output = outContent.toString();

        assertTrue(output.contains("Valor fora do intervalo permitido [1 a 5]"));
    }

    @Test
    @DisplayName("[Teste da variável QUANTIDADE - Valores Limite] Deve lançar exception quando valor limite for 6 e aceitar 5")
    void readValidatedInputIntScenario10() {
        // Entrada inválida com 6 e depois uma entrada válida para sair do loop
        String simulatedInput = "6\n5\n";
        //Simula a entrada do usuário com valor 6 e 5
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner scanner = new Scanner(in);

        // Captura a saída do console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        int result = readValidatedInputInt(scanner,"Entre com a quantidade de ingressos: ", 1, 5);

        // Restaura o System.out
        System.setOut(originalOut);

        // Valida o resultado final
        assertEquals(5, result);

        // Valida que as mensagens de erro foram exibidas
        String output = outContent.toString();

        assertTrue(output.contains("Valor fora do intervalo permitido [1 a 5]"));
    }
}