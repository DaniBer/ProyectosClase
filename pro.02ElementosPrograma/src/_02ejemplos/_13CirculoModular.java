package _02ejemplos;
import java.util.*;
/**
 * 
 * @author alumno
 */
public class _13CirculoModular {
    public static void main(String args[]){
            Scanner tec = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Introduce radio: ");
            double radio = tec.nextDouble();
            
            double longitud = longitudCircunferencia(radio);
            System.out.println("Longitud de la circunferencia: " + longitud);
            
            //La llamada a un método se puede hacer "al vuelo"
            System.out.println("Area del círculo: " + areaCirculo(radio));
            System.out.println("Volumen de la esfera: " + volumenEsfera(radio));
    }
    /**
     * Calcula la longitud de una circunferencia dado su radio
     * @param radio es el radio de la circunferencia
     * @return devuelve la longitud de la circunferencia
     */
    public static double longitudCircunferencia(double radio){
        double longitud = 2*Math.PI*radio;
        return longitud;
        
    }
    
    /**
     * Calcula el area de un círculo dado su radio
     * @param r el radio del círculo
     * @return 
     */
    public static double areaCirculo(double r){
        double resultado = Math.PI*r*r;
        return resultado;
    }
    
    public static double volumenEsfera(double r){
        return (4/3.0)*Math.PI*Math.pow(r, 3);
        
    }
}
