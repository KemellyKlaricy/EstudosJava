package Exercicios;

import java.util.Scanner;

public class ConverterTemperaturas {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double tempFahrenheit = entrada.nextDouble();

        double converterFahrenheit = (tempFahrenheit - 32) * 5/9;

        System.out.println("Digite a temperatura em Celsius : ");
        double tempCelsius  = entrada.nextDouble();

        double converterCelsius  = (tempCelsius * 9/5) + 32;

        System.out.println("A temperatura " + tempFahrenheit + "F° convertida para Celsius fica: " + converterFahrenheit + "C°");
        System.out.println("A temperatura " + tempCelsius + "C° convertida para Fahrenheit fica: " + converterCelsius + "F°");



        entrada.close();
    }
}
