package _03ejercicios;

import java.util.Scanner;

public class _03IntermedioDeTres {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int a = tec.nextInt();
                System.out.println("Introduce otro número: ");

        int b = tec.nextInt();
                System.out.println("Introduce un número más: ");

        int c = tec.nextInt();
        
        if ((a < b && b < c)||(a < c && c < b)) System.out.println("El intermedio es: " +b);
        else if ((b < a && a < c)||(b < c && c < a)) System.out.println("El intermedio es: " + a);
        else System.out.println("El intermedio es: " + c);
           
        
        //sin operadores lógicos
        
        if(a<b){
           if (c<a)System.out.println("El intermedio es: " + a); 
           else if (c<b)System.out.println("El intermedio es: " + c); 
           if (c<a)System.out.println("El intermedio es: " + b); 
        }else{
            
        }
    }
}
