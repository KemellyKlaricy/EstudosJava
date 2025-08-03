public class TiposPrimitivos {

    public static void main(String[] args) {
       // Informações do Funcionario

       //Tipos Numéricos Inteiros
       byte anosDeEmpresa = 23;
       short numeroDeVoos = 542;
       int id = 56789;
       long pontosAcumulados = 3_234_845_223L;
       

       //Tipos Numéricos Reais
       float salario = 11_445.44f;
       double vendasAcumuladas = 2_991_797_103.01;

       //Tipo Booleano
       boolean estaDeFerias = false; //true

       //Tipo Caractere
       char status = 'A';

       //Dias de empresa
       System.out.println(anosDeEmpresa * 365);

       //Números de viagens
       System.out.println(numeroDeVoos / 2);

       //Pontos por real
       System.out.println(pontosAcumulados / vendasAcumuladas);

       System.out.println(id + ": ganha -> " + salario);
       System.out.println("Ferias? " + estaDeFerias);
       System.out.println("Status: " + status);


    }
}