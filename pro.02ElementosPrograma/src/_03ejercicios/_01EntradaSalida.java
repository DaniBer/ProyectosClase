package _03ejercicios;
import java.util.*;
public class _01EntradaSalida {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        int a, b;
        System.out.println("Introduce un número entero");
        a = tec.nextInt();
        System.out.println("Introduce otro número entero");
        b = tec.nextInt();
        System.out.println("Los número introducidos son " + a + " y " + b);
    }
}
/*-Al introducir un número real en lugar de un número entero nos sale un error
de ejecución en el hilo principal del código, ya que no hemos hecho el programa
para leer números reales (float o double)sino números enteros (int)
 -Si escribimos un carácter no númerico como por ejemplo la letra "G" nos aparece
el mismo error de ejecución en el hilo principal del código, esta vez tendríamos 
que haberle dado al programa la capacidad de leer caracteres (char)
-Si eliminamos la instrucción import java.util* se producirá otro error,esta vez
de compilación, ya que no entenderá la instrucción Scanner tec = new Scanner(System.in)
*/
