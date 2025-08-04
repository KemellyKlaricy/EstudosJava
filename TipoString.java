// Criando uma classe chamada TipoString
public class TipoString {

    // Esse é o método principal, onde o programa começa a rodar
    public static void main(String[] args) {

        // Mostra na tela o caractere que está na posição 3 da frase "Olá pessoal"
        System.out.println("Olá pessoal".charAt(3)); // Vai mostrar um espaço em branco

        // Cria uma variável com a frase "Boa tarde"
        String s = "Boa tarde";

        // Transforma tudo em letras maiúsculas
        s = s.toUpperCase(); // Agora s é "BOA TARDE"

        // Adiciona "!!!" no final da frase e mostra o resultado
        System.out.println(s.concat("!!!")); // Mostra: "BOA TARDE!!!"

        // Verifica se a frase começa com "Boa" (lembre que maiúsculas fazem diferença aqui)
        System.out.println(s.startsWith("Boa")); // false, porque agora tá tudo em maiúsculo

        // Mesmo teste, mas com "boa" em minúsculo
        System.out.println(s.startsWith("boa")); // false também

        // Verifica se a frase termina com "tarde!" (vai dar false)
        System.out.println(s.endsWith("tarde!")); // false, por causa do ponto de exclamação e letras minúsculas

        // Verifica se termina com "TARDE" (tudo maiúsculo agora)
        System.out.println(s.endsWith("TARDE")); // true

        // Mostra quantos caracteres tem a frase
        System.out.println(s.length()); // Mostra 9

        // Compara a string com "boa tarde", exatamente como está
        System.out.println(s.equals("boa tarde")); // false, porque agora é "BOA TARDE"

        // Compara ignorando se é maiúsculo ou minúsculo
        System.out.println(s.equalsIgnoreCase("boa tarde")); // true

        // Cria algumas variáveis com nome, sobrenome, idade e salário
        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        // Mostra esses dados de forma simples, usando o + pra juntar tudo
        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);

        // Mostra os dados formatados, com o salário aparecendo com duas casas decimais
        System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f." , nome , sobrenome,  idade, salario);

        // Cria uma frase já formatada com os dados e guarda em uma variável
        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f." , nome , sobrenome,  idade, salario);
        
        // Mostra a frase formatada
        System.out.println(frase);

        // Verifica se a palavra "qual" aparece dentro da frase
        System.out.println("Frase qualquer".contains("qual")); 
        // Vai dar true, porque "qual" está dentro da frase

        // Mostra em que posição da frase começa a palavra "qual"
        System.out.println("Frase qualquer".indexOf("qual")); 
        // Vai mostrar 6, que é onde começa o "q" de "qual"

        // Pega a parte da frase a partir da posição 6 até o final
        System.out.println("Frase qualquer".substring(6)); 
        // Vai mostrar: "qualquer"

        // Pega só do índice 6 até o 9 (o 10 não entra, tá?)
        System.out.println("Frase qualquer".substring(6,10)); 
        // Vai mostrar: "qual"
    }
}