package _02ejemplos;

public class _11NumerosAleatorios {
    public static void main(String args[]){
        int a = 10, b = 20;
        
        //Número real en el intervalo [0,1[
        System.out.println(Math.random());
        
        //Número real entre [0,5[ 
        System.out.println(Math.random()*5);
        
        //Número real entre [1,6[
        System.out.println(Math.random()*5+1);
        
        //Número entero entre [1,6[
        System.out.println((int)(Math.random()*5+1));
        
        //Número entero entre [1,6]
        System.out.println((int)(Math.random()*6+1));
        
        //Número entero aleatorio entre [a,b]
        System.out.println((int)(a + Math.random()*(b-a+1)));
        
        //Número aleatorio entre 17 y 21
        System.out.println((int)(17 + Math.random()*(21-17+1)));
    }
}
