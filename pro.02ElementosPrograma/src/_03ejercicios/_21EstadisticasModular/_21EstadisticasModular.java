package _03ejercicios._21EstadisticasModular;

public class _21EstadisticasModular {
    public static void main(String args[]){
        double num1 = LecturaDatos.leerDouble("Introduce num 1: ");
        double num2 = LecturaDatos.leerDouble("Introduce num 2: ");
        double num3 = LecturaDatos.leerDouble("Introduce num 3: ");
        
        //Realizamos calculos
        double media = Estadisticas.media(num1, num2, num3);
        
        //Mostramos resusltados
        System.out.println("Medias: "+ media);
        
       //Varinza 
        double varianza = Estadisticas.varianza(num1, num2, num3);
        System.out.println("La varianza es: " + varianza);
        
        //Desviación Tipica5
        
        double desvTipica = Estadisticas.desvTipica(num1, num2, num3);
        System.out.println("La desviación típica es: " + desvTipica);
    }
}
