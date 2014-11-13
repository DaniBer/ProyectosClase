

package _02ejemplos;
import java.util.Scanner;
public class _03EntradaTeclado {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = tec.nextLine();
        
        System.out.println("Introduce tu edad:");
        int edad = tec.nextInt();
        
        System.out.println("Te llamas " + nombre + " y tienes " + edad + " años");
    }
}
