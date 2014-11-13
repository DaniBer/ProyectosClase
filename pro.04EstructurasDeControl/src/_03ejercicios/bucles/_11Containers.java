package _03ejercicios.bucles;
import java.util.*;
public class _11Containers {
    public static void main(String args[]){ 
        
        Scanner tec = new Scanner(System.in);
        double peso, containers, sumaPeso;
            
        sumaPeso = 0;
        containers = 0;
        //peso <=700 , containers <= 100
        do{
            System.out.println("Introduce el peso del container en toneladas: ");
            peso = tec.nextDouble();
            sumaPeso = sumaPeso + peso;
            containers++;
        } while (sumaPeso <= 700 && containers <= 100);
        
        System.out.println("Número containers: " + containers);
        System.out.println("Peso total: " + sumaPeso);
    }
}
