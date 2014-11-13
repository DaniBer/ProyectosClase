package _03ejercicios;
import java.util.*;
public class _08Medidas {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);
        
        // .useLocale(Locale.US) sirve para no tener que utilizar comas en vez de puntos para los decimales
        double pies, yardas, pulgadas, metros, centímetros;
        
        System.out.println("Introduzca una medida(en pies)");
        
        pies = tec.nextDouble();
       
       //Cambio de medidas
        
        yardas = pies/3;
        pulgadas = pies*12; 
        centímetros = 2.54*pulgadas;
        metros = centímetros/100;
        
        System.out.println("La cantidad de "+ pies + " pies son " + yardas + " yardas " + pulgadas + " pulgadas " + centímetros + " centímetros " + metros + " metros ");
        
        //Salida con format
        System.out.format("%7.2f pies equivalen a: \n",pies);
        System.out.format("%7.2f pulgadas:\n", pulgadas);
        System.out.format("%7.2f yardas:\n", yardas);
        System.out.format("%7.2f metros.\n", metros);
        System.out.format("%7.2f centímetros.\n", centímetros);
      
        
        
    }

    
    }

