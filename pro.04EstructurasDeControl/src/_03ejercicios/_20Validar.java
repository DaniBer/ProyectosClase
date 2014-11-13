package _03ejercicios;
import java.util.*;
public class _20Validar {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce el valor de 'x': ");
        char letra = tec.next().toLowerCase().charAt(0);
        System.out.println("Introduce el valor de 'y' (1-10): ");
        int num = tec.nextInt();
        
        boolean valido = (num>=1 && num<=10 && (letra == 'a' && num % 2 != 0 || letra == 'b' && num % 2 == 0));
  
        
        
        System.out.println("Son "+(valido?"Válidos":"No válidos")); 
    }
}
