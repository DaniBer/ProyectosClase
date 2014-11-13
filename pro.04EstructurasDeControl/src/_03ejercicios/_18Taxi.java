package _03ejercicios;
import java.util.*;
public class _18Taxi {
    
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in);
        
        System.out.println("Vamos a calcular el coste de tu trayecto en taxi, para ello deberás introducir: ");
        System.out.println("Hora del trayecto: ");
        int hora = tec.nextInt();
        System.out.println("Minuto de este: ");
        int min = tec.nextInt();
        System.out.println("Día de la semana expresado del 1 al 7(donde 1 es el lunes): ");
        int dia = tec.nextInt();
        System.out.println("Kilómetros del trayecto: ");
        double km = tec.nextDouble();
        
         //Descubrimos si el horario diurno o nocturno o fin de semana
         double coste;
            
         if (dia<6){
                                 
            
             if (hora<6 && hora>=22){
                                
                 coste = km * 0.84;
                 
                 if (coste < 4)
                 coste = 4;
             } else { 
                 coste = km * 0.73;
                 if (coste < 2.95)
                     coste = 2.95;
               }
             System.out.println("El coste del trayecto es de: " + coste);
         } else {
             
             coste = km * 0.93;
             System.out.format("El coste del trayecto es de: %5.2f €\n " ,coste);
             /*Solución profesor
             Otra forma sería declarando las tarifas como constantes
             
             public class _18Taxi {
             final static double PRECIODIA = 0.73;
             final static double PRECIONOCHE = 0.84;
             final static double PRECIOFS = 0.93;
             final static double MINIMODIA = 2.95;
             final static double MINIMONOCHE = 4;
             
              System.out.println("Vamos a calcular el coste de tu trayecto en taxi, para ello deberás introducir: ");
              System.out.println("Hora del trayecto: ");
                int hora = tec.nextInt();
              System.out.println("Minuto de este: ");
                int min = tec.nextInt();
              System.out.println("Día de la semana expresado del 1 al 7(donde 1 es el lunes): ");
                int dia = tec.nextInt();
              System.out.println("Kilómetros del trayecto: ");
                double km = tec.nextDouble();
             
             //Tipo de tarifa
             boolean esFinSemana = (d == 6|| d == 7);
             
             //if (d == 6||d == 7) esFinSemana = true;
             //else esFinSemana = false;
             
             boolean esDiurna = (h >=6 && (h < 22 || h == 22 & m == 0));
             
             //Calculamos carrera
             double importe;
             if(esFinSemana) importe = km * PRECIOFS;
             else
                 if(esDiurna) importe = km * PRECIODIA;
                 else importe = km * PRECIONOCHE;
             
             //Aplicamos mínimo si corresponde
             if(esDiurna){
                if (importe < MINIMODIA) importe = MINIMODIA;
             // importe = Math.max(importe, MINIMODIA);
             }else
                if (importe < MINIMONOCHE) importe = MINIMONOCHE;
             // importe =  Math.max(importe, MINIMONOCHE);
             */
          }
               
         
    }
}

