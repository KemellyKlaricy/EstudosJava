package CodigosAulas.Operadores;

public class Aritmeticos {
    public static void main(String[] args) {
        

        var x = 34.56;
        double y = 2.2;

        System.out.println(x + y); //Soma
        System.out.println(x - y); //Subtração
        System.out.println(x * y); // Multiplicação
        System.out.println(x / y); // Divisão
        System.out.println(x % y);//Resto da divisão

        int a = 8;
        int b = 3;

        System.out.println(a + b); //Soma
        System.out.println(a - b); //Subtração
        System.out.println(a * b); // Multiplicação
        System.out.println(a / b); // Divisão inteira
        System.out.println(a / (double) b);// Divisão usando CAST
        System.out.println(a % b);//Resto da divisão

        System.out.println(x + y - a * b);


    }
}
