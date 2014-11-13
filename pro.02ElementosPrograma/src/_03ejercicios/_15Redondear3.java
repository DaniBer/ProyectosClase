package _03ejercicios;
import java.util.*;
public class _15Redondear3 {
    public static void main(String args[]){
         Scanner tec = new Scanner(System.in).useLocale(Locale.US);
         
        System.out.println("Introduzca un número real: ");
        double a = tec.nextDouble();
        
        System.out.println("A cuantos decimales quieres redondear: ");
        int d = tec.nextInt();
        
        double b = Math.pow(10,d);
        
        a = a*b;
        a = Math.round(a);
        a = a/b;
        System.out.println("El número redondeado es: " + a);
       
        //En una sola instrucción sería:
        System.out.println("El número redondeado es: "+ Math.round(a*b)/b);
    }
}
