package _03ejercicios.bucles;
import java.util.*;
public class _03PotenciasDe2 {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce el número al que te gustaría elevar el 2:" );
        int n = tec.nextInt();
        int cont = 0;
        int potencia = 1;
        for(; cont < n; cont++) potencia = potencia*2;
        System.out.println("2 elevado a "+ n +" es igual a "+potencia);
    }
}
