package _03ejercicios._04buclesAnidados;

import java.util.Scanner;

public class _05TablaMult {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in);
        
        int contMulti, contNum = 1;
        
        System.out.println("Introduzca un número: ");
        int num = tec.nextInt();
        
         while(contNum<=num){
             
             contMulti=0;
         
            System.out.println("Tabla del "+contNum+": "); 
            
            while(contMulti<=10){
                int multi = contNum * contMulti;
                System.out.println(contNum+" por " +contMulti+" = "+multi);
                contMulti++;
                
            }
            System.out.println("-----------------------------");
            contNum++;
        }   
    }
}
