package _03ejercicios._04buclesAnidados;

import java.util.Scanner;

public class _03NotasPorAsignaturas {

    final static int A = 6;//NUMERO DE ALUMNOS
    final static int S = 4;//NUMERO DE ASIGNATURAS

    public static void main(String args[]) {

        Scanner tec = new Scanner(System.in);

        int cont = 1, contAl;
        double nota;

        do {
            System.out.println("Asignatura " + cont);
            for (contAl = 1; contAl <= A; contAl++) {
                System.out.println("Introduce nota del alumno " + contAl + ": ");
                nota = tec.nextDouble();
            }
            cont++;
        } while (cont <= S);
    }
}
