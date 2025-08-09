package ClassesMetodos;

public class Produto {

    String nome;
    double preço;
    double desconto;

    double precoComDesconto(){
        return preço * (1 - desconto);
    }

    double precoComDesconto(double descontoGerente){
        return preço * (1 - (desconto + descontoGerente));
    }


    
}
