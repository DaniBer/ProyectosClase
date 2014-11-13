package _03ejercicios;
import java.util.*;
public class _09Segundos {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce una cantidad de segundos");
        int cantidad = tec.nextInt();
        int dias, horas, minutos, segundos;
        
        System.out.println(cantidad + " segundos son ");
        //Dias
        dias = cantidad / 86400;
        cantidad = cantidad % 86400;
                
        //Horas
        horas = cantidad / 3600;
        cantidad = cantidad % 3600;
        
        //minutos
        minutos = cantidad / 60;
        segundos = cantidad % 60;
        
        System.out.println( dias + " dias, ");
        System.out.println( horas + " horas, ");
        System.out.println( minutos + " minutos, ");
        System.out.println( segundos + " minutos, ");
        
        //todo lo de arriba podria meterse en una sola linea
        System.out.println(dias + "dias,\n" + horas + "horas,\n" + minutos + "minutos,\n" + segundos + "segundos");
        
        
        //sacamos a pantalla mediante método format
        System.out.format("dias %d horas %d minutos %d segundos %d", dias, horas, minutos, segundos);
    }
}
