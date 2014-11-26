package tiposproblema;

import java.util.Scanner;

public class Tipo1 {
   static Scanner tec = new Scanner(System.in);
   
    public static void main(String[] args) {
   
        int n = tec.nextInt();
        for(int i = 1; i<=n; i++){
            resolverCaso();
        }       
    }
    public static void resolverCaso(){
        int num = tec.nextInt();
        if(num%2 == 0) System.out.println("PAR");
        else System.out.println("IMPAR");
    }
}
