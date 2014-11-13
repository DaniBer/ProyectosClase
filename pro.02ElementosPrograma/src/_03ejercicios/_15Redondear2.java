package _03ejercicios;
import java.util.*;
public class _15Redondear2 {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introduzca un número real: ");
        double a = tec.nextDouble();
        a = a*100;
        a = Math.round(a);
        a = a/100;
        System.out.println("El número redondeado es " + a);
    }
}
