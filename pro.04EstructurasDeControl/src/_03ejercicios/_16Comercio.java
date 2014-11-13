
package _03ejercicios;
import java.util.*;
public class _16Comercio {
    final static double DESCUENTO = 0.08;
    
    public static void main (String[]args){
        
        
        
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Introduce el valor total de tu compra: ");
        double compra = tec.nextDouble();
        
        
         
        if(compra>=40){
         double totalDescuento = compra*DESCUENTO;
         double precioFinal = compra*(1-DESCUENTO);
         
           if(totalDescuento>=12){
               totalDescuento = 12;
              precioFinal = compra - 12;
           } 
        
        
        System.out.println("Importe de la compra: " + compra);
        System.out.println("Porcentaje de descuento aplicado: " + 100*DESCUENTO + "%");
        System.out.println("Descuento aplicado: " + totalDescuento);
        System.out.format("Cantidad a pagar: %7.2f \n" ,precioFinal);
        }else{ 
            System.out.println("No se atribuye ningún descuento para esta cantidad");
        }
    }
}
