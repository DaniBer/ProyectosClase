package _02ejemplos;

public class _15MetodoSinResultado {
    public static void main(String args[]){
        //Estos métodos tambien son llamados procedimientos
        //No hay que poner una variable = saludar porque no hay nada que devolver
        //Tampoco hay que poner return
        saludar("Juan");
        saludar("Miguel");
        saludar("Ana");
    }
    
    public static void saludar(String nombre){
        System.out.println("Hola " + nombre);
    }
}
