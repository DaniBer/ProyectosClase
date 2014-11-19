package _04Examenes;

import java.util.Scanner;

public class _01Examen {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce el dia de la semana (1-7): ");
        int diaSemana = tec.nextInt();
       
        
        System.out.println("Género de la película: ");
        String genero = tec.next();
       
        
        System.out.println("Edad: ");
        int edad = tec.nextInt();
       
        
        System.out.println("Número de socio: ");
        int numSocio = tec.nextInt();
        
       double entrada = 9;
       
       if (numSocio > 0){
           entrada = 0;
       }else{ 
           if(edad < 13){
                if(genero.toLowerCase().equals("infantil"))
                     entrada = entrada - 3;
                else
                    entrada = entrada -2;
          }else if(edad >= 65) entrada = entrada -2;
        }
       
       if (diaSemana ==3) entrada = entrada/2;
        System.out.println("El precio de la entrada es: "+ entrada + "€");
    
  }
}
