package _02ejemplos;
/**
 * Pretendemos hacer un método que reduzca un número a la mitad
 * Lo vamos a resolver de dos formas, una correcta y otra incorrecta
 */
public class _18PasosParametroPorValor {
    public static void main(String args[]){

            double x = 40.8;
            System.out.println("Antes de llamar al primer metodo: " + x);
            reducirAlaMitad1(x); //El @ sirve para hacer el paso por valor o por referencia.
            System.out.println("Después de llamar al primer metodo: " + x);

            System.out.println("Antes de llamar al segundo metodo: " + x);
            x = reducirAlaMitad2(x);
            System.out.println("Antes de llamar al segundo metodo: " + x);
    }
    
    public static void reducirAlaMitad1(double numero){
        numero = numero / 2;
    }
    
        public static double reducirAlaMitad2(double numero){
            return numero / 2;
        }
}
