package _03ejercicios._21EstadisticasModular;

public class Estadisticas {
    /**
     * Calcula y devuelve la media de tres números reales
     * que recibe como parámetro.
     * @param args 
     */
    public static double media(double a,double b,double c){
        return (a+b+c)/3;

    }

    public static double varianza(double a, double b, double c){
           double media = media(a,b,c);
           double varianza = (Math.pow(media-a,2)+ Math.pow(media-b,2)+ Math.pow(media-c,2))/3;
           return varianza;
        }
    public static double desvTipica (double a, double b, double c){
        double varianza = varianza(a,b,c);
        double desvTipica = Math.sqrt(varianza);
        return desvTipica;
    }
}
