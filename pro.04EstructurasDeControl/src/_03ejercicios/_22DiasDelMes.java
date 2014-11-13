
package _03ejercicios;

import java.util.*;
public class _22DiasDelMes {
    public static void main (String[]args){
        Scanner tec = new Scanner (System.in);
        System.out.println("Mes: ");
        
        int mes = tec.nextInt();
        
        switch(mes){
            case 1: 
            case 3: 
            case 5:
            case 7:
            case 9:
            case 11:
                  System.out.println("Este mes tiene 31 días");
                break; 
            case 2: System.out.println("Este mes tiene 28 días");
                break;
            
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:  System.out.println("Este mes tiene 30 días");  
                break;
                       
            default: System.out.println("Mes incorrecto");    
        }
    }
    
}
