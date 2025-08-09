package ClassesMetodos.Desafios;

import java.util.Scanner;

public class DataTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Data data1 = new Data();
        System.out.println("Digite o dia: ");
        data1.dia = entrada.nextInt();
        System.out.println("Digite o mês: ");
        data1.mês = entrada.nextInt();
        System.out.println("Digite o ano: ");
        data1.ano = entrada.nextInt();

        System.out.println(data1.obterDataFormatada());

        entrada.close();

    }
    
}
