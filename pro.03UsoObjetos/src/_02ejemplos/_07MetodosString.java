package _02ejemplos;
import java.util.*;
public class _07MetodosString {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        
        //El método charAT devuelve el carácter indicado por parámetro
        System.out.println("Introduce un texto:");
        String texto = tec.nextLine();
        //El indice 0 saca el primer caracter, el 1 sacaría el segundo.
        System.out.println("Texto con charAt: "+ texto.charAt(0));
        
        //El método indexOf nos indica el parámetro del primer caracter del texto introducido. 
        //indexof(caracter)
        //indexof(caracter,posición)
        //indexof (String)
        //indexof(String,posición)
                String texto1 = "Hola a todo el mundo";
         System.out.println("Texto con indexOf: " + texto1.indexOf("todo"));
         
         //El método subString devolverá los caracteres que se encuentren en el intervalo escrito.
         //substring(begin,end)
               String texto2 = "Hola compañero";
             System.out.println("Intervalo[0,13[ del texto Hola compañero es : " + texto2.substring(0,13));
         //El método toLowerCase  convierte el String a minúsculas.
            System.out.println("Introduce un texto en Mayúsculas: ");
            String texto3 = tec.nextLine();
             System.out.println("En minúsculas: " + texto3.toLowerCase());
             
         //El método trim elimina los espacios del String
             
            
            String texto4 = "Ayer fui al mercado";
           texto4 =  texto4.trim();
            System.out.println("El texto afectado por trim: " + texto4);
            
         //El método Length devuelve la longitud del String.
           System.out.println("Usando el método length: " +texto4.length());
           
           //Ejemplo sobre introduce hora
           System.out.println("Introduce la hora (00:00:00): ");
           String texto5 = tec.nextLine();
           String hora = texto5.substring(0,2);
           String minutos = texto5.substring(3,5);
           String segundos = texto5.substring(6,8);
           System.out.println("Hora: "+ hora);
           System.out.println("Minutos: " + minutos);
           System.out.println("Segundos: "+ segundos);
    }
          
}
