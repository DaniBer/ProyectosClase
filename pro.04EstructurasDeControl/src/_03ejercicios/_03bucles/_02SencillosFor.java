package _03ejercicios._03bucles;


import java.util.Scanner;

public class _02SencillosFor {
    
    public static Scanner tec = new Scanner(System.in);
   
    public static void main(String args[]){

       sumaDivisoresN(); 
        
    }
    public static void imparesHastaN(){
        System.out.println("Introduce un número: ");
        int num = tec.nextInt();
        System.out.println("Los números impares entre 1 y "+num+" son: ");
        for(int cont =1; cont<=num; cont=cont+2){
            System.out.println(cont);
        }
            
    }
    public static void nImpares(){
        System.out.println("Introduce un número: ");
        int num = tec.nextInt();
       
        for (int cont=0,impar=1; cont<num; impar=impar+2,cont++){
            System.out.println(impar);
        }
    }
    public static void cuentaAtras(){
         
         System.out.println("Introduce un número entero: ");
         int n = tec.nextInt();
         
         System.out.println("Cuenta a atrás desde " + n + ": ");
         for(;n>=0;n--){
             System.out.println(n);
         }
    }
    public static void sumaNPrimeros(){
         
         System.out.println("Introduce un número entero: ");
         int n = tec.nextInt();
         int suma = 0;
         for(int min=1;min<=n; min++){
             suma = suma + min;
         }
        
        System.out.println("La suma total es: " + suma);
     }
    public static void mostrarDivisores(){
         
         System.out.println("Introduce un número entero:");
         int n = tec.nextInt();         
                  
         System.out.println("Los divisores de" + n + " son: ");
         for(int cont=1; cont<=n/2;cont++){
             if(n % cont == 0)System.out.println(cont);
         }
         System.out.println(n);               
         
    }
    public static void sumaDivisoresN(){
         
         System.out.println("Introduce un número entero:");
         int n = tec.nextInt();
         int suma = 0;
         for(int cont=1; cont < n/2;cont++ ){
         
             if(n % cont == 0)
             suma = suma + cont;                                 
         }
         
         System.out.println("La suma de los divisores de " + n + " es: "+ suma);
     }
}
