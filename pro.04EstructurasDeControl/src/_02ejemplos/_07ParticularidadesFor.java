package _02ejemplos;

public class _07ParticularidadesFor {
    public static void main(String args[]){

        //La variable se puede declarar fuera o dentro.
        //Si se declara dentro será local al bucle
        int num1;
        for(num1=1; num1<=5; num1++){
            System.out.println(num1);
        }
        System.out.println(num1);
        
        for(int num2 = 1; num2 <= 5; num2++){
            System.out.println(num2);
        }
        //System.out.println(num2); //La variable num2 es local al for
        
        System.out.println("-------------------");
        //El INICIO y el AVANCE pueden tener más de una instrucción
        //Separadas por comas
        for(int i=1, j=10; i<=j; i++,j--){
            System.out.println(i + ", "+ j);
        }
        
        System.out.println("-------------------");
        //Tanto el INICIO como el AVANCE son opcionales, la CONDICION no!!
        //SIempre habrá que poner los ';'
        int num3 = 1;
        for(;num3<=5; num3++){
            System.out.println(num3);
        }
        
        for(int num4 = 1; num4<=5;){
            System.out.println(num4);
            num4++;
        }
        
        int num5 = 1;
        for(;num5<=5;){
            System.out.println(num5);
            num5++;
        }
    }
}
