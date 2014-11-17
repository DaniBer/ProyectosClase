package _03ejercicios._03bucles;

import java.util.Scanner;

public class _08SumaSerie {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in);
        
        
        System.out.println("Introduce un número: ");
        double num = tec.nextDouble();
        double cont = 1;
        double sumaDiv = 0;
        while(cont <= num) {
            sumaDiv = sumaDiv + 1/cont;
            cont++;
        }
        System.out.println("La suma es: " + sumaDiv);
       
    }
}
