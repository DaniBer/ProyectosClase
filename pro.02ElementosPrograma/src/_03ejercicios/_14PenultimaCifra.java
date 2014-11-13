package _03ejercicios;
import java.util.*;
public class _14PenultimaCifra {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduzca un número entero ");
        int a = tec.nextInt();
        
        System.out.println("La penúltima cifra de "+ a + " es " +(a%100)/10);
    }
}
