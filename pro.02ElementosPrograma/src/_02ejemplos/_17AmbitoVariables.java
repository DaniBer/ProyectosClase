package _02ejemplos;

public class _17AmbitoVariables {
    static int g = 0; //"g" es una variable global
    public static void main(String args[]){
        int a = 0; //local al método main
        System.out.println(a);
        
        int b = 0; //local al método main
        System.out.println(b);
        
        //int b; //Error porque "b" ya está declarada en main
        
        if(a>b){
            int num = 20; //num es local al bloque de código
            System.out.println(num);
        }
        //System.out.println(num); // Error porque num es local al bloque 
        
        
    }
    public static void metodo1(int x){
        //System.out.println(a); Nos da error porque metodo1 no tiene acceso a la variable "a"
        int b = 7; //local a metodo1, esta variable "b" sería diferente de la "b" del método main
        System.out.println(b);
    }
    public static void metodo2(int x){
        double b = 5.5;
        //int x; //Error porque "x" ya está declarada en metodo2
    
    System.out.println(g);
    }
}
