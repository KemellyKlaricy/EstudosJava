public class Temperatura {

    public static void main(String[] args) {
        double temperaturaFehrenheit = 200.0;
        double ajuste = 32;
        double fator = 5.0/9.0;
        double temperaturaCelsius = (temperaturaFehrenheit - ajuste) * fator;

        System.out.println(temperaturaCelsius + " Celsius");
        
    }
}