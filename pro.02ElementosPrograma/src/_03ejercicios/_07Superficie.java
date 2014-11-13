package _03ejercicios;
import java.util.Scanner;
public class _07Superficie {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
       double longitud, anchura;
        System.out.println("Introduzca la longitud de su habitación");
        longitud = tec.nextDouble();
        System.out.println("Introduzca ahora la anchura");
        anchura = tec.nextDouble();
        System.out.println("La superficie de su habitación es " + longitud*anchura);
    }
}
