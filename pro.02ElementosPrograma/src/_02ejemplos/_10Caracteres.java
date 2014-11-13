package _02ejemplos;

public class _10Caracteres {
    public static void main(String args[]){
        //Una variable entera y una de tipo char
        int num = 65;
        char letra = 'M';
        System.out.println(num);
        System.out.println(letra);
        
        
        //Un entero se puede interpretar como un carácter.
        System.out.println((char) num);
        /*si ejecutamos esta instrucción nos sale la letra 'A'que es el caracter
        asignado al número 65 en la tabla ASCII*/
        
        //Un carácter se puede interpretar como un número (77=M, Tabla ASCII)
        System.out.println((int)letra);
        
        //Obtener la siguiente letra
        letra ++;
        System.out.println(letra);
        
        //Pasar una letra minúcula a mayúscula
        char minuscula = 'p';
        char mayuscula = (char) (minuscula - 32);
        char mayuscula1 = (char) (minuscula - ('a'- 'A'));//de otro modo
        System.out.println(mayuscula);
        System.out.println(mayuscula1);
        
        //Secuencias de escape
        //Para que se muestre Él dijo "Hola"
        System.out.println("Él dijo \" Hola\"");
    }
}
