package Exercicios;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner entrada = new  Scanner(System.in);

        System.out.println("Digite o seu número: ");
        float numero = entrada.nextFloat();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        System.out.printf("O numero %.1f ao quadrado é %.1f e ao cubo é %.1f", numero, quadrado, cubo);

        entrada.close();
    }
}
