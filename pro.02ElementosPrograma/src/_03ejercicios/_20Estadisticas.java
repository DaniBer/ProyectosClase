package _03ejercicios;
import java.util.*;
import static java.util.Locale.US;
public class _20Estadisticas {
        /**
         * Dados tres valores reales introducidos por el usuario
         * calcular y mostrar su media
         * @param args 
         */
    public static void main(String args[]){
            Scanner tec = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Introduce un número real: ");
            double a = tec.nextDouble();
            System.out.println("Introduce un número real: ");
            double b = tec.nextDouble();
            System.out.println("Introduce un número real: ");
            double c = tec.nextDouble();
            
            //Media
            double media = (a+b+c)/3;
            System.out.println("La media es: " + media);

            //Varianza
            double varianza = (Math.pow(media-a,2)+Math.pow(media-b,2)+Math.pow(media-c,2))/3;
            System.out.println("La varianza es: "+ varianza);
            
            //Desviación típica
            double desvtip = Math.sqrt(varianza);
            System.out.println("La desviación típica es: " +desvtip);
    }
}
