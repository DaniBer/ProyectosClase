package _02ejemplos;
import pizarra.Pizarra;
public class _02IdentidadDeObjetos {
    public static void main(String args[]){
        /*Dos objetos son distintos aunque tengan los mismos valores 
        en sus atributos (aunq sean idénticos)*/
       
        
        //"p" y "q" son objetos distintos
        Pizarra p = new Pizarra ("hola",300,300);
        Pizarra q = new Pizarra ("hola",300,300);
        
        //"q" y "r" son el mismo objeto
        Pizarra r = q;
    }
}
