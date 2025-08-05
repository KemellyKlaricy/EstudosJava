package Exercicios;
//Desafio: Resolva a seguinte expressão matemática 
    //(( [6 * (3 + 2)]² / (3 * 2) ) - ( (1 - 5) * (2 - 7) / 2 )² )³ ÷ 10³

public class DesafioAritmeticos {
    public static void main(String[] args) {
        
        double parte1F1 = (6 * (3+2));
        double formula1 = (Math.pow(parte1F1, 2)) / (3 *2);
        double parte1F2 = (1 - 5) * (2 -7) / 2;
        double formula2 = Math.pow(parte1F2, 2);

        double parte1F3 = formula1 - formula2;
       
        double formulaFinal = (Math.pow(parte1F3, 3)) / (Math.pow(10, 3));

        System.out.println(formulaFinal);
    }
    
}
