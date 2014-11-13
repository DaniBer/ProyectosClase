package _03ejercicios;

import figuras.Rectangulo;
import pizarra.Pizarra;

public class _03MitadYMitad {
    public static void main(String args[]){
       Pizarra p =  new Pizarra();
       Rectangulo r = new Rectangulo(0,0,0,(p.getAnchura())/2,p.getAltura());
       Rectangulo t = new Rectangulo(2,p.getAnchura()/2,0,(p.getAnchura())/2,p.getAltura());
        p.anyadir(r);
        p.anyadir(t);
    }
}
