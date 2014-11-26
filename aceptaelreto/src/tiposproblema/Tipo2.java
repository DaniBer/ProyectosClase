package tiposproblema;

import java.util.Scanner;

public class Tipo2 {
   static Scanner tec = new Scanner(System.in);
   
    public static void main(String[] args) {
   
        boolean seguir;
        do{
           seguir = resolverCaso();
        }while(seguir ==true);       
    }
    public static boolean resolverCaso(){
        int num = tec.nextInt();
        if(num == 0) return false;
                
        if(num%2 == 0) System.out.println("PAR");
        else System.out.println("IMPAR");
        
        return true;
    }
}
