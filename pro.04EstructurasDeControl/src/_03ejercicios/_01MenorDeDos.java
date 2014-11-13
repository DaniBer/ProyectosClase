package _03ejercicios;
import java.util.*;
public class _01MenorDeDos {
    
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce un número entero: ");
        int a = tec.nextInt();
        System.out.println("Introduce otro número entero: ");
        int b = tec.nextInt();
        
       if(a!=b){             
            if (a<b)System.out.println("El menor es: " + a);
            else   System.out.println("El menor es: " + b);     
            
        }else{
            System.out.println("Son iguales");
        } 
    }
}
