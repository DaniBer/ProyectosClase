package _02ejemplos;
import java.util.*;
public class _07MediaDeTres {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce el primer número:");
        int a = tec.nextInt();
        System.out.println("Introduce el segundo número:");
        int b = tec.nextInt();
        System.out.println("Introduce el tercer número:");
        int c = tec.nextInt();
         
        double media = (a+b+c)/3.0;
        System.out.println("La media de estos 3 números enteros es " + media);
        
        System.out.format("La media de %d, %d, %d es %f\n",a,b,c,media);
        
        //%d se utiliza para números decimales (enteros) mientras que %f es para números float(reales)
        // la \n o %n sirven para hacer saltos de linea ya que format no los realiza por sí solo
        System.out.format("La media de %d, %d, %d es %5.2f\n",a,b,c,media);
        /*al poner 5.2 le estamos diciendo al programa que nos muestre 5 números
        2 de los cuales irán detrás de la coma
        */
        
        System.out.format("La media de %d, %d, %d es %-5.2f\n",a,b,c,media);
        
        //para alinear los caracteres a la izquierda pondremos un -5.2
        
        System.out.format("La media de %d, %d, %d es %05.2f%n",a,b,c,media);
        
        //con 05.2 le decimos que rellene los 5 caracteres con ceros
    }
}
