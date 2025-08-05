package CodigosAulas.TiposPrimitivos;
public class ConversãoTiposPrimitivosNumericos {
    public static void main(String[] args) {
        
        double a = 1; //Conversão Implícita
        System.out.println(a); //Sem perca de informação

        float b = (float) 1.0; //Conversão Explicita: Sem perca de informação
        float ba = 1.12345678888F; //Conversão Explicita: Aqui ja perdeu informação
        System.out.println(b);
        System.out.println(ba);

        int c = 130;
        //byte d = c; - Aqui daria erro, pois o int é muito maior que o byte
        byte d = (byte) c; //Conversão Explicita: Aqui ja perdeu informação e a conversão fica trucada
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e; //Conversão Explicita: Aqui ja perdeu informação e a conversão fica trucada
        System.out.println(f);

        


    }
}
