package _03ejercicios;
import java.util.*;
public class _13UltimaCifra {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduzca un número entero ");
        int a = tec.nextInt();
        System.out.println("La última cifra de "+ a + " es " +(a%10));
    }
}
