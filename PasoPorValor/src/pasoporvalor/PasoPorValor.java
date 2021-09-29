package pasoporvalor;

public class PasoPorValor {
    
    public static void main(String[] args) {
        var a = 10;
        System.out.println("a = " + a);
        cambiarValor(a);
    }

    public static void cambiarValor(int arg1) {
        System.out.println("arg1 = " + arg1);
        arg1 = 1;
        System.out.println("arg1 = " + arg1);
        
    }
}
