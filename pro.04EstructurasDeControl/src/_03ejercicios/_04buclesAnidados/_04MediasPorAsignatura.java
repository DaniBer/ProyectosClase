package _03ejercicios._04buclesAnidados;

import java.util.Locale;
import java.util.Scanner;

public class _04MediasPorAsignatura {

    final static int A = 6;//NUMERO DE ALUMNOS
    final static int S = 4;//NUMERO DE ASIGNATURAS

    public static void main(String args[]) {

        Scanner tec = new Scanner(System.in).useLocale(Locale.US);

        int cont = 1, contAl;
        double nota;

        do {
            System.out.println("Asignatura " + cont);
            double sumaNotas = 0;
            for (contAl = 1; contAl <= A; contAl++) {
                System.out.println("Introduce nota del alumno " + contAl + ": ");
                nota = tec.nextDouble();
                sumaNotas = sumaNotas + nota;
            }
            System.out.println("Media de la asignatura: " + (sumaNotas / A));
            cont++;
        } while (cont <= S);
    }
}
