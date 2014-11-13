package _02ejemplos;
/**
 * Según lo visto, un String, al no se de uno de los 8 tipos primiticos
 * debería pasarse por referencia a los métodos.
 * Sin embargo los cambios hechos en el parámetro real no afectan al
 * parámetros formal porque los Strings son invariables.
 */
public class _20PasoParametroString {
    public static void main(String args[]){
        String saludo = "Hola";
        completarSaludo(saludo);
        
        System.out.println(saludo);    
        
        //La forma adecuada de conseguirlo sería la siguiente
        saludo = completarSaludo2(saludo);
        System.out.println(saludo);
    }
    
    public static void completarSaludo(String saludo){
        saludo = saludo + " Pepe";
    }
    
    public static String completarSaludo2(String saludo){
        
        return saludo + " Pepe";
    }
}
