package Sessao4_EstruturasDeControle.CodigosAulas;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        System.out.println("Informe a média: ");
        double media = entrada.nextDouble();

        if(media >= 7.0){
            System.out.println("Aprovado!");
        }
        if(media < 7.0 && media >= 4){
            System.out.println("Recuperação!");
        }
        if(media < 4){
            System.out.println("Reprovado!");
        }



        entrada.close();
    }
}
