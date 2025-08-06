package Sessao4_EstruturasDeControle.CodigosAulas;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String valor = "";
        
        while(!valor.equalsIgnoreCase("sair")){
            System.out.println("Digite a palavra: ");
            valor = entrada.nextLine();
        }

        System.out.println("------------------------");
        System.out.println("Saindo ...");

        entrada.close();
    }
}
