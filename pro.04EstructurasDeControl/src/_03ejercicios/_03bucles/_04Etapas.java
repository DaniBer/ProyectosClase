package _03ejercicios._03bucles;

import java.util.Scanner;

public class _04Etapas {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in);
        
            int cont = 0;
            int contInf = 0;
            int contPub = 0;
            int contAdo = 0;
            int contAdu = 0;
            int contVej = 0;
            int contAnc = 0;
            
          
            
        System.out.println("Número de personas que participan en la muestra: ");
        int numEdades = tec.nextInt();
        
        
        while(cont<numEdades){
            
            System.out.println("Introduce una edad " + (cont+1) + " : ");
            int edad = tec.nextInt();
            cont++;
             if(edad <=10)contInf++;
            else if(edad <= 14)contPub++;
            else if(edad <= 21)contAdo++;
            else if(edad <= 55)contAdu++;
            else if(edad <= 70)contVej++;
            else contAnc++;
          
        }
       
      System.out.println("Infancia: " +Math.round(((double)contInf / cont)*100.) + "%");
        System.out.println("Pubertad: "+Math.round(((double)contPub / cont)*100) + "%");
        System.out.println("Adolescencia: "+ Math.round(((double)contAdo / cont)*100) + "%");
        System.out.println("Adultez: "+ Math.round(((double)contAdu / cont)*100) + "%");
        System.out.println("Vejez: "+ Math.round(((double)contVej / cont)*100) + "%");
        System.out.println("Ancianidad: "+ Math.round(((double)contAnc / cont)*100) + "%");
    }
}
