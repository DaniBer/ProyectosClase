package _02ejemplos;

import java.util.Scanner;

public class _05LeerEdades {
    public static void main(String args[]){

          Scanner tec = new Scanner(System.in);
          
          System.out.println("¿Cuantas edades quieres introducir?");
          int numEdades = tec.nextInt();
          
          
        int cont = 0;//Numero de valores introducidos por el usuario
        int suma = 0;//Suma de los valores introducidos por el usuario
        int edad;
        while(cont<numEdades){
        System.out.println("Introduce edad "+ (cont+1) + ": ");
        edad = tec.nextInt();
        cont++;
        suma = suma + edad;
        }
        System.out.println("Media: " + ((double)suma/numEdades));
    }
}
