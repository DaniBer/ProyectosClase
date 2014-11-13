package _03ejercicios;

import java.util.Scanner;

public class _02MenorDeTres {
    
    public static void main(String args[]){

              Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce un número entero: ");
        int a = tec.nextInt();
        System.out.println("Introduce otro número entero: ");
        int b = tec.nextInt();
        System.out.println("Introduce otro número entero: ");
        int c = tec.nextInt();
        
         if((a!=b)&&(a!=c)){             
            if (a<b&&a<c)System.out.println("El menor es: " + a);
            else if (b<a&&b<c) System.out.println("El menor es: " + b);     
                 else if (c<a&&c<b) System.out.println("El menor es: " + c);
                    
        }else{
           //System.out.println("Los tres números son iguales.");
        } 
         //si fuesen iguales 2 o más números
          if(a!=b&&a!=c){             
            if (a<b&&a<c)System.out.println("El menor es: " + a);
            else if (b<a&&b<c) System.out.println("El menor es: " + b);     
                 else if (c<a&&c<b) System.out.println("El menor es: " + c);
                    
        }else{
          if (a==b)System.out.println("El primer y el segundo número son iguales: " +a);
                     else if (a==c)System.out.println("El primer y el tercer número son iguales: "+a);
                         else if (b==c && b!=a)System.out.println("El segundo y el tercer número son iguales: "+b);
                         //else System.out.println("Los tres números son iguales.");
          }
    }
}
    

