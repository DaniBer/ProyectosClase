package _02ejemplos;
import pizarra.Pizarra;
import figuras.Circulo;
import figuras.Rectangulo;
public class _03EjecutarMetodosDeUnObjeto {
    public static void main(String args[]){
        Pizarra p = new Pizarra("Prueba",600,400);
        Circulo c = new Circulo(300,200,100);
        p.anyadir(c);

         Pizarra q = new Pizarra("Prueba",800,400);
        Rectangulo r = new Rectangulo(250,100,300,150);
        q.anyadir(r);
    }
}
