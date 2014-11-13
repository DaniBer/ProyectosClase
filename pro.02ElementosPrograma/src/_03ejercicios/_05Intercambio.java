package _03ejercicios;
import java.util.*;
public class _05Intercambio {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        double v1, v2;
        
        System.out.println("Introduce valor real: ");
        v1 = tec.nextDouble();
        System.out.println("Introduce valor real: ");
        v2 = tec.nextDouble();
        System.out.println("Antes de intercambiar");
        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);
        
        //Intercambiamos v1 y v2
        double v3;
        v3 = v1;
        v1 = v2;
        v2 = v3;
        
        //----------
        
        System.out.println("Después de intercambiar");
        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);
    }
}
