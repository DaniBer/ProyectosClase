package _03ejercicios;

import figuras.Circulo;
import figuras.Figura;
import pizarra.Pizarra;

public class _08AgrandarCirculo {
    public static void main(String args[]){
        Pizarra p = new Pizarra();
        Circulo c = new Circulo(Figura.AMARILLO,0,0,(int)(Math.random()*101)+100);
        p.anyadir(c);
        
        p.esperar(750);
        
        c.setRadio((int)(c.getRadio()*1.5));
    }
}
