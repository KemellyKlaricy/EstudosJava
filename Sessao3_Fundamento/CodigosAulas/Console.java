package CodigosAulas;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        
        //Três formas de jogar dados no console
        System.out.println("Bom");
        System.out.println("dia!\n\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d %n" , 1, 2, 3, 4, 5, 6);
        System.out.printf("Salario %.1f", 1234.5678);

        //Forma de pegar informações do usuario atraves do console
        
        Scanner entrada = new Scanner(System.in); //Abrir Scanner

        System.out.print("\nDigite o seu nome: ");
        String nome = entrada.nextLine(); //Guardar as informações de String no scanner

        System.out.print("Digite o seu Sobrenome: ");
        String sobrenome = entrada.nextLine();//Guardar as informações de String no scanner

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();//Guardar as informações de int no scanner

        System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

        entrada.close(); //Fechar Scanner
        
        
    }
}
