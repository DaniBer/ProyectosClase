package _01pruebas;
import java.util.*;
public class _01LeerNumeroPositivo {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce un número positivo: ");
        int num = tec.nextInt();
        
        
        while(num<0){
            System.out.println("Error.");
            System.out.println("Introduce un número positivo: ");
             num = tec.nextInt();
        }
        
        System.out.println("El número introducido es: "+ num);
        
        
        //----------------------------------------
        //int num;
        do {
            System.out.println("Introduce un número positivo: ");
            num = tec.nextInt();
        } while(num<0);
        
    
    }
}
