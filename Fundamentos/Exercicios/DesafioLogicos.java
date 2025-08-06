package Exercicios;
/*Questão: Imagina que você tem dois trabalhos: um na terça-feira e outro na quinta-feira.
    - Se os dois trabalhos derem certo, você vai comprar uma TV de 50 polegadas.
    - Se apenas um dos trabalhos der certo, você vai comprar uma TV de 32 polegadas.
    - Se você comprar qualquer uma das TVs, a família toda vai tomar sorvete.
    - Se nenhum dos trabalhos der certo, a família vai ficar em casa.*/

public class DesafioLogicos {
    public static void main(String[] args) {

        boolean trabalhoTerca = true;
        boolean trabalhoQuinta = false;
        boolean tomouSorvete = trabalhoQuinta || trabalhoTerca;
        boolean maisSaudavel = !tomouSorvete;

        boolean tv50P = trabalhoTerca && trabalhoQuinta;
        boolean tv32P = trabalhoQuinta ^ trabalhoTerca;


        System.out.println("Comprou a TV 50 polegadas? " + tv50P);
        System.out.println("Comprou a TV de 32 Polegadas? " + tv32P);
        System.out.println("Tomou sorvete? "  + tomouSorvete);
        System.out.println("Mais saudável? " + maisSaudavel);

    }
    
}
