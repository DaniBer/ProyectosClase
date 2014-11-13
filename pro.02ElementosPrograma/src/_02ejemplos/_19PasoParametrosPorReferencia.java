package _02ejemplos;
import java.util.*;
public class _19PasoParametrosPorReferencia {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce numero real (Decimales separados por coma): ");
        double num1 = tec.nextDouble();
        System.out.println("Introduce numero real (Decimales separados por punto): ");
        double num2 = tec.nextDouble();
        
        System.out.println(num1);
        System.out.println(num2);
        
    }
    /**
     * Modifica el objeto Scanner recibido como parámetro
     * para que acepte los decimales separados por un punto
     */
    public static void ponerSeparadorPunto(Scanner t){
        t.useLocale(Locale.US);
    }
   
}
