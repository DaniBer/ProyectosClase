package _03ejercicios;
import java.util.*;
public class _18Einstein {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
       System.out.println("Introduce la masa: ");
       double m = tec.nextDouble();
       
       final double c2 = Math.pow(2.997925E8,2);
       double E = m*c2;
       
       System.out.println("La energía correspondiente a esta masa es " + E);
       
    }
}
