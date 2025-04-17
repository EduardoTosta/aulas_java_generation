package aula_05;

import java.util.Scanner;

public class MediaNotasClasse {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        final int ALUNOS = 10;
        final int BIMESTRES = 4;

        double[][] notas = new double[ALUNOS][BIMESTRES];
        double[] medias = new double[ALUNOS];

        // Entrada de dados
        for (int i = 0; i < ALUNOS; i++) {
            System.out.println("Digite as 4 notas do aluno " + (i + 1) + ":");
            for (int j = 0; j < BIMESTRES; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = leia.nextDouble();
            }
        }

        // Cálculo das médias
        for (int i = 0; i < ALUNOS; i++) {
            double soma = 0;
            for (int j = 0; j < BIMESTRES; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / BIMESTRES;
        }

        // Exibindo as médias com 1 casa decimal
        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < ALUNOS; i++) {
            System.out.printf("Aluno %d: %.1f\n", (i + 1), medias[i]);
        }

        leia.close();
    }
}
