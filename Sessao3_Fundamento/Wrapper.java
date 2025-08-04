public class Wrapper {

    public static void main(String[] args) {

        System.out.println("--- Tipos Numéricos ---");

        // Byte - Tipo de dado para números inteiros pequenos.
        // Autoboxing: converte automaticamente o primitivo 'byte' para o objeto 'Byte'.
        Byte b = 100;
        System.out.println("Valor do Byte: " + b);
        System.out.println("Valor primitivo do Byte: " + b.byteValue());

        // Short - Tipo de dado para números inteiros um pouco maiores.
        Short s = 1000;
        System.out.println("\nValor do Short: " + s);
        System.out.println("Convertendo Short para String: " + s.toString());

        // Integer - Um dos Wrappers mais usados, para números inteiros.
        Integer i = 10000;
        System.out.println("\nValor do Integer: " + i);
        System.out.println("Multiplicando o Integer: " + (i * 3));

        // Long - Para números inteiros muito grandes, precisa do 'L' no final.
        Long l = 100000L;
        System.out.println("\nValor do Long: " + l);
        System.out.println("Dividindo o Long: " + (l / 3));

        // Float - Para números decimais de precisão simples, precisa do 'f' no final.
        Float f = 123.45F;
        System.out.println("\nValor do Float: " + f);
        System.out.println("Convertendo Float para int: " + f.intValue());

        // Double - O mais comum para números decimais, de precisão dupla.
        Double d = 123.4567;
        System.out.println("\nValor do Double: " + d);
        System.out.println("Convertendo Double para String: " + Double.toString(d));

        System.out.println("\n--- Tipos de Caracteres e Lógicos ---");

        // Character - Para um único caractere.
        Character c = 'A';
        System.out.println("Valor do Character: " + c);
        System.out.println("Verificando se é um dígito: " + Character.isDigit(c));
        System.out.println("Convertendo para minúsculo: " + Character.toLowerCase(c));

        // Boolean - Para valores lógicos (true ou false).
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println("\nValor do Boolean: " + bo);
        System.out.println("Convertendo para String maiúscula: " + bo.toString().toUpperCase());
        System.out.println("Verificando se é false: " + bo.booleanValue());

        System.out.println("\n--- Conversões de Strings ---");

        // Exemplo de conversão de String para outros tipos
        String numeroString = "98765";
        int numeroInt = Integer.parseInt(numeroString);
        System.out.println("String '" + numeroString + "' para int: " + numeroInt);

        String booleanoString = "false";
        boolean booleano = Boolean.parseBoolean(booleanoString);
        System.out.println("String '" + booleanoString + "' para boolean: " + booleano);

    }
}