/**
         *Tenemos una clase DeporteTexto que calcula la FCM(frecuencia cardíaca máxima)
         * la FCE(frecuencia cardíaca de Esfuerzo) y el IMC(indice de masa corporal). Para
         * ello 
         * @param edad edad del individuo.
         * @param sexo carácter que indica el sexo del individuo.Si es el carácter 'H'
         * calcula la FCM de un hombre y si es distinto de 'H', de una mujer. 
         * @param fcr frecuencia cardiaca en reposo.
         * @param peso peso en KG del individuo.
         * @param estatura cuanto mide el individuo en Metros.
         * @return FCM,FCE,IMC.
         */
package deporte;
import java.util.*;
public class DeporteTexto {
    public static void main (String args[]){
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);

        //Entrada por pantalla de la "edad, sexo, fcr" del individuo
        System.out.println("Introduzca su edad: ");
        int edad = tec.nextInt();
       
        System.out.println("Indique si es H(Hombre) o M(Mujer): ");
        char sexo = tec.next().toUpperCase().charAt(0);    
        
        System.out.println("Introduzca su Frecuencia cardíaca en reposo(FCR): ");
        int fcr = tec.nextInt();
        
        //Cálculo de la FCM llamando al método "calcularFCM" de la clase Salud, 
        //Salida por pantalla de la FCM
        System.out.println("Su Frecuencia cardíaca Máxima es: " + Salud.calcularFCM(edad, sexo));
        
        //Cálculo de FCE llamando al método "calcularFCE" de la clase Salud,dándole un valor al parámetro porcentajeEsfuerzo.
        //Y salida por pantalla del FCE correspondiente
        System.out.println("---------------------Rangos de FCE---------------------");
        System.out.println("Con el rango A (50%-60%) Acondicionamiento Básico: " + Salud.calcularFCE(edad, sexo, fcr, 50) + " ---- "
                + Salud.calcularFCE(edad, sexo, fcr, 60)); 
    
        System.out.println("Con el rango B (60%-70%) Mantenimiento físico y salud: " + Salud.calcularFCE(edad, sexo, fcr, 60) + " ---- "
                + Salud.calcularFCE(edad, sexo, fcr, 70)); 
       
        System.out.println("Con el rango C (70%-80%) Buena Condición Física: " + Salud.calcularFCE(edad, sexo, fcr, 70) + " ---- "
                + Salud.calcularFCE(edad, sexo, fcr, 80) ); 
      
        System.out.println("Con el rango D (80%-90%) Deportistas de alto nivel: " + Salud.calcularFCE(edad, sexo, fcr, 80) + " ---- " 
                + Salud.calcularFCE(edad, sexo, fcr, 90) ); 
        
        /*Pedimos el peso y la estatura para posteriormente calcular el IMC llamando al método "calcularIMC" que se encuentra
        en la clase Salud*/
        
        System.out.println("------------------Ahora calcularemos tu IMC------------------");
        System.out.println("Primero dime tu peso(kg): ");
        double peso = tec.nextDouble();
        System.out.println("Y ahora tu estatura en metros: ");
        double estatura = tec.nextDouble();
        
        System.out.println("Tú IMC es: " + Salud.calcularIMC(peso, estatura));
        
        
        }
        
        
        
    
        
         
               
}
