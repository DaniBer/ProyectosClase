package _02ejemplos;

import figuras.Circulo;
import pizarra.Pizarra;

public class _06StaticVsNoEstaticos {
    public static void main(String args[]){
              Pizarra p =  new Pizarra();
       Circulo c1 = new Circulo(100,100,50);
        System.out.println("Radio " + c1.getRadio());
        System.out.println("Area " + Circulo.area(c1.getRadio()));
        p.anyadir(c1);
        

    }
}
