
package _03ejercicios;

import java.util.*;

public class _24Calculadora {
    public static void main (String[]args){
        
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);
        
        
        System.out.println("Introduce el primer número: ");
        double num1 = tec.nextDouble();
        System.out.println("Introduce un operador entre suma(+), resta(-), multiplicación(*) y división(/): ");
        char operador = tec.next().charAt(0);
        System.out.println("Introduce el segundo número: ");
        double num2 = tec.nextDouble();
        
         double suma = num1 + num2;
        double resta = num1 - num2;
        double multi = num1 * num2;
        double divi = num1 / num2;
        
        switch(operador){
            case '+': System.out.println("El resultado de la suma es: "  + suma);
               break;
            case '-': System.out.println("El resultado de la resta es: " + resta);
                break;
            case '*': System.out.println("El resultado de la multiplicación es: " + multi);
                break;
            case '/': System.out.println("El resultado de la división es: " + divi);
                break;
            default: System.out.println("El operador es incorrecto.");
        }
        
    }
    
}
