package _03ejercicios._03bucles;
import java.util.*;
public class _01SencillosWhile {
    
     public static Scanner tec = new Scanner(System.in);
    
     public static void main(String args[]){
        
      cuentaAtras();
        
    }
     
     public static void imparesHastaN(){
        System.out.println("Introduce un número entero: ");
        int max = tec.nextInt();
        int num = 1;
        
        
         System.out.println("Los número impares entre 1 y "+ max +" son: ");
         
        while(max>num){
            
            System.out.println(num);
            num = num + 2;
        }
     }
     
     public static void nImpares(){
            
            System.out.println("Introduce un número entero: ");
            int max = tec.nextInt();
            int num = 1;
            int cont = 0;
            
            System.out.println("Los 3 primeros números impares entre 1 y "+ max +" son: ");
         
         while(cont<max){
            
            System.out.println(num);
            cont = cont + 1;
            num = num + 2;
        }
     }
     
     public static void cuentaAtras(){
         
         System.out.println("Introduce un número entero: ");
         int n = tec.nextInt();
         
         System.out.println("Cuenta a atrás desde " + n + ": ");
         while(n>=0){
             System.out.println(n);
             n--;
         }
     }
     
     public static void sumaNPrimeros(){
         
         System.out.println("Introduce un número entero: ");
         int n = tec.nextInt();
         int min = 1;
         int suma = 0;
         
         while(min<=n){
             suma = suma + min;
             min++;
         }
         System.out.println("La suma total es: " + suma);
     }
     
     public static void mostrarDivisores(){
         
         System.out.println("Introduce un número entero:");
         int n = tec.nextInt();
         
         int cont = 1;
         
         System.out.println("Los divisores de" + n + " son: ");
         
         while(cont <= n/2){
             
             if(n % cont == 0) System.out.println(cont);
             cont++;
               
         }
         System.out.println(n);
     }
     
     public static void sumaDivisoresN(){
         
         System.out.println("Introduce un número entero:");
         int n = tec.nextInt();
         
         int cont = 1;
         int suma = 0;
         
         while(cont < n/2){
             
             if(n % cont == 0)
             suma = suma + cont;
             cont++;
                    
         }
         
         System.out.println("La suma de los divisores de " + n + " es: "+ suma);
     }
}
