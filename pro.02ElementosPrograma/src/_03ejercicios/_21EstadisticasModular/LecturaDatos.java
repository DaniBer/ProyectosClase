package _03ejercicios._21EstadisticasModular;
import java.util.*;
public class LecturaDatos {
    public static double leerDouble(String texto){
        System.out.println(texto);
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);
        double num = tec.nextDouble();
        
        return num;
    }
}
