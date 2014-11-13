package _02ejemplos;
import java.util.*;
public class _12ClaseRandom {
    public static void main(String args[]){
        Random r = new Random();
        System.out.println(r.nextBoolean());
        System.out.println(r.nextDouble());
        System.out.println(r.nextInt(5));
        
        //Permite reproducir experimentos indicando una semilla
        Random r2 = new Random(2);
        System.out.println(r2.nextBoolean());
        System.out.println(r2.nextDouble());
        System.out.println(r2.nextInt(5));
    }
}
