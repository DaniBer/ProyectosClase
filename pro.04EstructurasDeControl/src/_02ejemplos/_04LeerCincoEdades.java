package _02ejemplos;

import java.util.Scanner;

public class _04LeerCincoEdades {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in);
        int cont = 0;//Numero de valores introducidos por el usuario
        int suma = 0;//Suma de los valores introducidos por el usuario
        int edad;
        while(cont<5){
        System.out.println("Introduce edad: ");
        edad = tec.nextInt();
        cont++;
        suma = suma + edad;
        }
        System.out.println("Media: " + suma/5.0);
    }
}
