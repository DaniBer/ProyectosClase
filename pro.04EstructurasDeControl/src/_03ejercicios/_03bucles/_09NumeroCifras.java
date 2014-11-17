package _03ejercicios._03bucles;

import java.util.Scanner;

public class _09NumeroCifras {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int num = tec.nextInt();
       
        int cifras = 0;
        if(num == 0)cifras = 1;
      
         else while(num != 0){
              num = num/10;
              cifras++;
          }
          
          
      System.out.println("Tiene " + cifras + " cifras.");
    }
}
