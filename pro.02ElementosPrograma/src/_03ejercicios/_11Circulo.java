package _03ejercicios;
import java.util.*;
public class _11Circulo {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce el radio:");
        double r = tec.nextDouble();
        
        double L = 2*Math.PI*r;
        double A = Math.PI*Math.pow(r, 2);
        
        System.out.format("Para un radio: %f\nLa longitud es: %f\nY el área es: %f\n ", r, L, A );
        
    }
}
