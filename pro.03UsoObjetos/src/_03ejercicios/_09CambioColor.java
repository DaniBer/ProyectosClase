package _03ejercicios;

import figuras.Figura;
import figuras.Rectangulo;
import pizarra.Pizarra;

public class _09CambioColor {
    public static void main(String args[]){
      Pizarra p =  new Pizarra();
       Rectangulo r = new Rectangulo(0,0,p.getAnchura(),p.getAltura());
     
        p.anyadir(r);
        
        p.esperar(500);
        r.setColor(Figura.AMARILLO);
        p.esperar(500);
        r.setColor(Figura.ROJO);
        p.esperar(500);
        r.setColor(Figura.VERDE);
        
        
    }
    
}
