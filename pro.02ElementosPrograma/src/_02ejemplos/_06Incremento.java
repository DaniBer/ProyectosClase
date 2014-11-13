package _02ejemplos;

public class _06Incremento {
    public static void main(String args[]){
        int num = 5;
        num++;
        System.out.println(num);
        
        ++num;
        System.out.println(num);
        
        num = num + 1;
        System.out.println(num);
        
        System.out.println("----------");
        
        /*en esta instrucción primero imprime y luego incrementa, por eso al ejecutar
        la isntrucción no le da tiempo a incrementar el número*/
        num = 5;
        System.out.println(num++);
        
        System.out.println("----------");
        
        //en esta instrucción pasa lo contrario, primero incrementa y luego imprime
        num = 5;
        System.out.println(++num);
    }
}
