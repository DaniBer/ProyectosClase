package _03ejercicios;

import figuras.Rectangulo;
import pizarra.Pizarra;

public class _04DosPartes {
    public static void main(String args[]){

       Pizarra p =  new Pizarra();
       Rectangulo r = new Rectangulo(0,0,0,p.getAnchura(),p.getAltura()/4);
  
       Rectangulo t = new Rectangulo(2,0,(p.getAltura()/4),p.getAnchura(),p.getAltura());
        p.anyadir(r);
        p.anyadir(t);
    }
}
