package _03ejercicios._04buclesAnidados;

import java.util.Scanner;

public class _10DibujarFiguras {

    public static void main(String args[]) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Ancho: ");
        int ancho = tec.nextInt();
        System.out.println("Alto: ");
        int alto = tec.nextInt();

        System.out.println("------------10.1-------------");
        dibRecAsteriscos(ancho, alto);
        
        System.out.println("-------------10.2------------");
        dibRecNumeros1(ancho, alto);
        
        System.out.println("-------------10.3------------");
        dibRecNumeros2(ancho, alto);
        
        System.out.println("-------------10.4------------");
        dibRecNumeros3(ancho, alto);
        
        System.out.println("-------------10.5------------");
        dibDiagonal(ancho, alto);
        
        System.out.println("-------------10.6------------");
        dibRecLetras(ancho, alto);
        
        System.out.println("-------------10.7------------");
        dibRdecLetras2(ancho, alto);
        
        System.out.println("-------------10.8------------");
        dibRecLetras3(ancho, alto);

    }

    public static void dibRecAsteriscos(int ancho, int alto) {

        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void dibRecNumeros1(int ancho, int alto) {

        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static void dibRecNumeros2(int ancho, int alto) {

        for (int i = 1; i <= alto; i++) {
            for (int j = ancho; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static void dibRecNumeros3(int ancho, int alto) {
        int cont = 1;
        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.format("%02d ", cont);
                cont++;
            }
            System.out.println("");
        }
    }

    public static void dibDiagonal(int ancho, int alto) {

        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                if (i == j) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void dibRecLetras(int ancho, int alto) {

        char letra = 'a';
        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.print(letra + " ");
            }
            letra++;
            System.out.println("");
        }
    }

    public static void dibRdecLetras2(int ancho, int alto) {

        char letra = 'a' - 1;
        letra += alto;
        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.print(letra + " ");
            }
            letra--;
            System.out.println("");
        }
    }

    public static void dibRecLetras3(int ancho, int alto) {

        char letra = 'a';
        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.print(letra + " ");
                letra++;
            }
            System.out.println("");
        }
    }

}
