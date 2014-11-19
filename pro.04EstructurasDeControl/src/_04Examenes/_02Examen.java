package _04Examenes;

import java.util.Locale;
import java.util.Scanner;

public class _02Examen {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);
        
        int unidades,sumaUnidades = 0, cont = 1;
        double  precio, sumaPrecio = 0, precioIVA,precioDescuento;
        do{
            System.out.println("Linea " + cont + " de la factura");
            System.out.print("Unidades:");
            unidades = tec.nextInt();
            if(unidades != 0){
                System.out.print("Precio: ");
                precio = tec.nextDouble();
            
                 sumaUnidades = sumaUnidades + unidades;
                 sumaPrecio = sumaPrecio + unidades * precio;
                 cont++;
            }  
        }while(cont<=10 || unidades != 0);
        System.out.println("Total unidades: " + sumaUnidades);
         System.out.println("Importe bruto: " + sumaPrecio);
        if(sumaUnidades > 100 || sumaPrecio > 1000){
            System.out.println("Descuento aplicable: 10%");
            System.out.println("Importe tras descuento " + sumaPrecio * 0.9 + "€" );
        }
        precioIVA = sumaPrecio * 1.18;
        
        System.out.println("Importe con IVA 18%: "+ precioIVA + "€");
        
    }
}
