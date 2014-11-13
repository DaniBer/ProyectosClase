package _02ejemplos;

public class _09Desbordamiento {
    public static void main(String args[]){
        byte a = 127;
        System.out.println(a);
        
        a++; /* La variable "a" se ve desbordada ya que los valores de byte van
             desde -128 hasta 127 por lo que sumarle 1 a 127 es incompatible y 
             vuelve al inicio (-128)*/
        System.out.println(a);
    }
}
