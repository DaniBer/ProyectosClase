package _02ejemplos;
import pizarra.*;
import figuras.*;
public class _05MoverFiguras {
    public static void main(String args[]){
           
        Pizarra p = new Pizarra("Mover figuras", 600,400);
        Circulo c1 = new Circulo (150,100,50);
        p.anyadir(c1);
        
        p.esperar(750);
        
        //Cambiamos las figuras de posición
        //sensación de desplazamiento
       
        int nuevaPosiciony = c1.getPosy()+10;
        c1.setPosy(nuevaPosiciony);
        
        
    }
}
