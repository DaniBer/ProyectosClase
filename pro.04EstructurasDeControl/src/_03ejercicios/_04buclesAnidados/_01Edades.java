package _03ejercicios._04buclesAnidados;

import java.util.Scanner;

public class _01Edades {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in);
        int cont, edad, sumaEdad;
        
        do{
            sumaEdad = 0;
            cont = 1;
            
            while(cont<=5){
            
                System.out.println("Introduzca la edad "+cont+": " );
                edad = tec.nextInt();
                sumaEdad = sumaEdad + edad;
                cont++;
            }
            if(sumaEdad<200)System.out.println("Suma insuficiente. Vuelva a introducir las edades.");
       }while(sumaEdad<200);
        
    }
}
