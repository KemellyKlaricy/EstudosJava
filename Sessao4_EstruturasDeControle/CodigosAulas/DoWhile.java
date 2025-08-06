package Sessao4_EstruturasDeControle.CodigosAulas;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //A sentença será executada no minimo 1 vez

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do{
            System.out.println("Você precisa falar as palavras mágicas....");
            System.out.println("Quer sair? ");
            texto = entrada.nextLine();
        } while(texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigada!!");

        entrada.close();

    }
    
}
