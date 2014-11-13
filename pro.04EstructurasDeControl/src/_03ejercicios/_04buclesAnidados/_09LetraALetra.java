package _03ejercicios._04buclesAnidados;

import java.util.Scanner;

public class _09LetraALetra {
    public static void main(String args[]){
        
        Scanner tec = new Scanner(System.in);
        int cont = 0;
        String texto;
        do {
            System.out.print("Introduce texto: ");
            texto = tec.nextLine();
        
            //Mostrar caracter a caracter
            while(cont < texto.length()){
                System.out.println(texto.charAt(cont));
                cont++;
            }
            
        } while(!texto.equals(""));
  
     }        
  }

