package _03ejercicios._03bucles;
import java.util.*;
public class _12Notas {
    public static void main(String args[]){

        Scanner tec = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Introduce la nota: ");
        double nota = tec.nextDouble();
        int cont = 0;
        int aprobados = 0;
        double total = 0;
        
        do{
            System.out.println("Introduce otra nota: ");
            nota = tec.nextDouble();
            if(nota>=0){ 
                cont++;
                total = total + nota;
                if(nota>=5)aprobados++;
            }
            
        }while (nota>=0);
        
        
        System.out.println("Has introducido "+cont+" notas");
        if(cont > 0){
            System.out.println("Han aprobado " + aprobados + " alumnos.");
            System.out.format("La media de la clase es de: %6.2f \n" , (total/cont));
        }
    }
}
