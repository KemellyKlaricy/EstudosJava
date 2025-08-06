package Exercicios;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a base do seu triangulo: ");
        double base = entrada.nextDouble();

        System.out.println("Digite a base do seu altura: ");
        double altura = entrada.nextDouble();

        double formula = (base * altura) / 2;

        System.out.println("A área total do seu triângulo é " + formula + "m²");

        entrada.close();
    }
}
