package _03ejercicios._03bucles;
import java.util.*;
public class _07Divisores {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int n = tec.nextInt();
        
        int cont = 1;
        int divMax = 0;
        
        System.out.println("Los 3 primeros divisores son: ");
        
        while(cont <= n && divMax<3){
             
            
             if(n % cont == 0){
                 
                System.out.println(cont);
                cont++;
                divMax++;
             }else
                 cont++;
                   
             }
          
        }
    }

