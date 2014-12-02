package _03ejercicios._04buclesAnidados;

import java.util.Scanner;

public class _02NotasPorAlumnos {

    final static int A = 6;//NUMERO DE ALUMNOS
    final static int S = 4;//NUMERO DE ASIGNATURAS

    public static void main(String args[]) {

        Scanner tec = new Scanner(System.in);

        int cont = 1, contAs;
        double nota;

        do {
            System.out.println("Alumno " + cont);
            for (contAs = 1; contAs <= S; contAs++) {
                System.out.println("Introduce nota de asignatura " + contAs + ": ");
                nota = tec.nextDouble();
            }
            cont++;
        } while (cont <= A);
    }
}
