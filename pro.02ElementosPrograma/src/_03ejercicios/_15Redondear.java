package _03ejercicios;
import java.util.*;
public class _15Redondear {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introduzca un número real: ");
        double a = tec.nextDouble();
        a = a*10;
        a = Math.round(a);
        a = a/10;
        System.out.println("El número redondeado es " + a);
        
    }
}
