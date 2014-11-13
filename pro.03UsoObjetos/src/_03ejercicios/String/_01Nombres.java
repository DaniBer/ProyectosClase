package _03ejercicios.String;
import java.util.Scanner;
public class _01Nombres {
    public static void main(String args[]){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce nombre completo");
        String nombreCompleto = tec.nextLine();
        
        System.out.println("Primera letra: "+ inicial(nombreCompleto));
        System.out.println("Ultima letra: "+ ultima(nombreCompleto));
        System.out.println("Nombre: "+ primeraPalabra(nombreCompleto));
        System.out.println("Apellido 1: "+ segundaPalabra(nombreCompleto));
        System.out.println("Apellido 2: "+ terceraPalabra(nombreCompleto));
    }
    public static char inicial(String texto){
       // texto = texto.toUpperCase();
        //char inicial = texto.charAt(0);
        //return inicial;
        return texto.toUpperCase().charAt(0);
    }
    public static char ultima(String texto){
       int ultima = texto.length()-1;     
     texto = texto.toUpperCase();    
    return texto.toUpperCase().charAt(ultima);
    // return texto.toUpperCase().charAt(texto.length()-1);
     }
   public static String primeraPalabra(String texto){
       int nombre = texto.indexOf(' ');
       String primera = texto.substring(0,nombre);
          return primera;
          //return texto.substring(0,texto.indexOf(' '));
      }
       public static String segundaPalabra(String texto){
           int nombre = texto.indexOf(' ');
           int apellido1 = texto.indexOf(' ',nombre+1);
           String segunda = texto.substring(nombre+1,apellido1);
           return segunda;
           
       }
        public static String terceraPalabra(String texto){
             int apellido2 = texto.lastIndexOf(' ');
         
            return texto.substring(apellido2+1);
        }

        
  }
        
