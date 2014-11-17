package _03ejercicios._03bucles;

import figuras.Circulo;
import figuras.Figura;
import pizarra.Pizarra;

public class _17CirculoCambiaColor {
    public static void main(String args[]){

        Pizarra p = new Pizarra("Circulo cambia de color", 800,600);
        
        int colorAleatorio = (int) (Math.random() * 4);
        
        Circulo c = new Circulo(colorAleatorio, 400,300,200);
        p.anyadir(c);
        
        while(c.getColor() != Figura.ROJO){
            colorAleatorio = (int) (Math.random() * 4);
            c.setColor(colorAleatorio);
            p.esperar(750);
    }
        
    }
}
