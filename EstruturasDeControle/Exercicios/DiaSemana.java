package EstruturasDeControle.Exercicios;

import java.util.Scanner;
 /*O usuario deve digitar o dia da semana e o programa deve retornar: 
        Domingo -> 1
        Segunda -> 2
        Terça -> 3
        Quarta -> 4
        Quinta -> 5
        Sexta -> 6
        Sabado -> 7 */

public class DiaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        String dia = entrada.nextLine();

        if(dia.equalsIgnoreCase("domingo") ){
            System.out.println("1");
        } else if(dia.equalsIgnoreCase("segunda")){
            System.out.println("2");
        } else if(dia.equalsIgnoreCase("Terça")){
            System.out.println("3");
        } else if (dia.equalsIgnoreCase("quarta")){
            System.out.println("4");
        } else if(dia.equalsIgnoreCase("Quinta")){
            System.out.println("5");
        }else if(dia.equalsIgnoreCase("sexta")){
            System.out.println("6");
        } else if(dia.equalsIgnoreCase("sabado")){
            System.out.println("7");
        } else{
            System.out.println("Dia da Semana inválido!");
        }

        entrada.close();
    }
    
}
