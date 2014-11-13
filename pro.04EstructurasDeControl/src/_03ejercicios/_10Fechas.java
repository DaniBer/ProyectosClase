package _03ejercicios;
import java.util.*;
public class _10Fechas {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        System.out.println("Vamos a introducir dos fechas y a compararlas.");
        
        //Primera fecha
        System.out.println("Introduce el día: ");
        int dia = tec.nextInt();
        System.out.println("Introduce ahora el mes: ");
        int mes = tec.nextInt();
        System.out.println("Introduce el año:");
        int año = tec.nextInt();
        
        //Segunda fecha
        System.out.println("Introduce el día: ");
        int dia2 = tec.nextInt();
        System.out.println("Introduce ahora el mes: ");
        int mes2 = tec.nextInt();
        System.out.println("Introduce el año:");
        int año2 = tec.nextInt();
        
        String fecha1 = dia+"/"+mes+"/"+año;
        String fecha2 = dia2+"/"+mes2+"/"+año2;
        //Secuencia lógica
        if (año==año2&&mes==mes2&&dia==dia2)System.out.println("Ambas fechas son iguales.");
        else if (año!=año2){
            if (año<año2)System.out.println("La fecha menor es: "+ fecha1);
            else System.out.println("La fecha menor es: "+ fecha2);
            
        }else{
             if(mes!=mes2){
                 if (mes<mes2)System.out.println("La fecha menor es: " + fecha1);
                 else System.out.println("La fecha menor es: " + fecha2);
             }else{     
                   if(dia<dia2) System.out.println("La fecha menor es: " + fecha1);
                   else System.out.println("La fecha menor es: " + fecha2);
              
                }   
             
            }
        
         // Con operadores lógicos.
         if (año<año2||año==año2 && mes<mes2||año==año2 && mes==mes2 && dia<dia2) System.out.println(fecha1);
         else System.out.println(fecha2);
        }
   
}
 
