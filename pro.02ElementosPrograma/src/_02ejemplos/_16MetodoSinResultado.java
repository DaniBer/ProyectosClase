package _02ejemplos;
import java.util.Locale;
import java.util.Scanner;
public class _16MetodoSinResultado {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        //Los decimales se introducen con coma(,)
        System.out.println("Introduce valor real: ");
        double d1 = tec.nextDouble();
        
        cambiarSeparador(tec);
        //Ahora los decimales se introducen con punto(.) en vez de coma
        System.out.println("Introduce valor real: ");
        double d2 = tec.nextDouble();
        
        //Este es otro método que no devuelve nada, únicamente cambia la forma de introducir decimales
    }
    
    public static void cambiarSeparador(Scanner s){
        s.useLocale(Locale.US);
    }
}
