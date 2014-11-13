package _03ejercicios;
import java.util.*;
public class _13Salario {
    public static void main(String args[]){

            Scanner tec = new Scanner(System.in);
            System.out.println("Introduce las horas que trabajas: ");
            
            int a = tec.nextInt();
            int b = a - 40;
            
            int brutoa = a*6;
            int a2 = 40;
            int brutob = (a2*6 + b*10);
           
            double deduc1 = 0.98;
            double deduc2 = 0.90;
            if (a<=a2&&brutoa<=350) System.out.println("El salario neto es: " + brutoa*deduc1);
            else  if (a<=a2&&brutoa>350)System.out.println("El salario neto es: " + brutoa*deduc2);
                if (a>a2&&brutob<350)System.out.println("El salario neto es : " + brutob*deduc1);
            else if (a>a2&&brutob>350)System.out.println("El salario neto es : " + brutob*deduc2);
                
           // Solución profesor
           /** 
            * int hTrabajadas = tec.nextInt();
            * int hExtras,hOrd;
                if (hTrabajadas<=40){
                    hExtra = 0;
                    hOrd = hTrabajadas;
                 }else{
                    hExtra = hTrabajadas - 40;
                    hOrd = 40;
                }
            // Salario bruto
             double salBruto = hOrd * 6 + hExtra * 10
              
           
            //Impuestos
            double impuesto;
             if(salBruto <=350) impuesto = 2;
             else impuesto = 10;
              
             //Salario neto
             double salNeto = salBruto - salBruto*impuesto/100;
             
             System.out.println("Salario neto: " + salNeto);
                **/
    }
}
