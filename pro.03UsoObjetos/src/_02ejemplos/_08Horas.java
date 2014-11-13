package _02ejemplos;
import java.util.Scanner;
public class _08Horas {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
  System.out.println("Introduce la hora (00:00:00): ");
           String texto5 = tec.nextLine();
           String hora = texto5.substring(0,2);
           String minutos = texto5.substring(3,5);
           String segundos = texto5.substring(6,8);
           System.out.println("Hora: "+ hora);
           System.out.println("Minutos: " + minutos);
           System.out.println("Segundos: "+ segundos);
           
           //introduce la hora y tienes q detectar los 2 puntos con el método indexOf
            System.out.println("Introduce la hora: ");
           String texto = tec.nextLine();
           
           int espacio = texto.indexOf(':');
           String hora1 = texto.substring(0,espacio);
           
           int espacio2 = texto.lastIndexOf(' ');
           String minutos1 = texto.substring(espacio+1,espacio2);
           
           String segundos1 = texto.substring(espacio2+1,texto.lastIndexOf(texto)-1);
           
           System.out.println("Hora: "+ hora1);
           System.out.println("Minutos: " + minutos1);
           System.out.println("Segundos: "+ segundos1);
    }
}
