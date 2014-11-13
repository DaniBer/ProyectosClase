package _03ejercicios;
import java.util.*;
public class _10Fuerza {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);
        double m1, m2, distancia,fuerza;
        /*final double hace de G una constante que no pueda variar su valor
        es también más óptima y rápida de leer que una variable normal. Siempre
        se pondrá la constante en mayúsculas para diferenciarla de las variables*/
        final double G; 
       System.out.println("Introduzca masa cuerpo 1:");
       m1 = tec.nextDouble();
       
       System.out.println("Introduzca masa cuerpo 2:");
       m2 = tec.nextDouble();
       
       System.out.println("Introduzca la distancia entre cuerpos:");
       distancia = tec.nextDouble();
       
       //operaciones
       distancia = distancia*distancia;
       G = 6.693E-11;
       fuerza = (G*m1*m2)/distancia;
       
       System.out.println("La fuerza de atracción entre estas dos masas es: " + fuerza);
    }
}
