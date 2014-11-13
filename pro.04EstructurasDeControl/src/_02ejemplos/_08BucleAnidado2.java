package _02ejemplos;

import java.util.Scanner;

public class _08BucleAnidado2 {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        int num; 
        int i = 1;
        //Pedimos 5 números
            //Pedimos al usuario un número positivo
          while(i<=5){  
            do{
                
                System.out.println("Introduce número positivo: " + i + ": ");
                num = tec.nextInt();
                if(num<=0){
                    System.out.println("Te has equivocado.");
                i++;
                }
            }while(num<=0);
             
          }
    }
}
