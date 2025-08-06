package Exercicios;

import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu peso(em KG): ");
        double peso = entrada.nextDouble();

        System.out.println("Digite sua altura(M): ");
        double altura = entrada.nextDouble();

        double calcularIMC = peso / (Math.pow(altura, 2));

        System.out.printf("Meu IMC é %.2f" ,  calcularIMC);


        entrada.close();
    }
}
