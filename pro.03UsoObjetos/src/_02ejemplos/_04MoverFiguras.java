package _02ejemplos;
import pizarra.*;
import figuras.*;
public class _04MoverFiguras {
    public static void main(String args[]){
        Pizarra p = new Pizarra("Mover figuras", 600,400);
        Circulo c1 = new Circulo (150,100,50);
        Circulo c2 = new Circulo (Figura.AMARILLO,350,100,50);
            Circulo c3 = new Circulo (Figura.ROJO,250,250,50);
        p.anyadir(c1);
        p.anyadir(c2);
        p.anyadir(c3);
        
        //con este comando hacemos esperar a la pizarra para realizar los cambios
        // el 500 es en milisegundos 1000 = 1 segundo
        p.esperar(750);
        //Cambiamos las figuras de posición
        //c1 bajará, c2 se moverá a la derecha y c3 subirá
        
        c1.setPosy(300);
        c2.setPosx(600);
        c3.setPosy(100);
        

    }
}
