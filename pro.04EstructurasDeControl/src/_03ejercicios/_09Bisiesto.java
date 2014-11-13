
package _03ejercicios;

import java.util.*;

public class _09Bisiesto {
    
     
      
    public static void main(String[]args){
      
        Scanner tec = new Scanner(System.in);
    
        System.out.println("Introduce un año: ");
    
             int anyo = tec.nextInt();
           
            if(esBisiesto(anyo)) System.out.println("El año " + anyo + " es bisiesto.");
             else System.out.println("El año " + anyo +  " no es bisiesto.");
   
  }
    
    public static boolean esBisiesto(int anyo){
        
        if(anyo % 4 == 0){
            if(anyo % 100 == 0){
                if(anyo % 400 == 0)return true;
                else return false;
            }else return true;
        }else return false;
        
    
        
     //O también se podría:
        
        //return anyo % 400 == 0 || (anyo % 4 == 0 && anyo % 100 != 0);
        
        
    }
}
