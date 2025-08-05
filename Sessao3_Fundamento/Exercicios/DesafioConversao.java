package Exercicios;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu primeiro salario: ");
        String salario1 = entrada.nextLine().replace(",", ".");

        System.out.println("Digite seu segundo salario: ");
        String salario2 = entrada.nextLine().replace(",", ".");

        System.out.println("Digite seu terceiro salario: ");
        String salario3 = entrada.nextLine().replace(",", ".");

        double s1 = Double.parseDouble(salario1);
        double s2 = Double.parseDouble(salario2);
        double s3 = Double.parseDouble(salario3);

        double media = (s1 + s2 + s3) / 3;

        System.out.printf("A media dos salarios é de R$ %.2f",  media);

        entrada.close();
    }
}