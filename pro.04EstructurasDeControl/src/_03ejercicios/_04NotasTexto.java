package _03ejercicios;

import java.util.*;

public class _04NotasTexto {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introduce tu nota: ");
        double nota = tec.nextDouble();
        
        
        if (nota<5) System.out.println("Insuficiente");
        else if(nota>=5&&nota<5.9)System.out.println("Suficiente");
        else if(nota>=5.9&&nota<6.9)System.out.println("Bien");
        else if(nota>=6.9 && nota<8)System.out.println("Notable");
        else if(nota>=8.9||nota==10)System.out.println("Sobresaliente");
        else System.out.println("La nota es incorrecta");
    }
}
