package com.senac.ordenacaosimples;

import java.util.Arrays;

/**
 *
 * @author vinivilasboas
 */

public class ExercicioSelectionSort {

    public static void main(String[] args) {

        int[] vetorA = {36, 15, 75, 2, 16, 48, 42, 51};

        selectionSort(vetorA);

        int[] vetorB = {13, 45, 38, 20, 23, 7, 6, 5, 10, 11};

        selectionSort(vetorB);

        int[] vetorC = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        selectionSort(vetorC);

    }

    public static void selectionSort(int[] vetor) {

        System.out.println("vetor inicial: " + Arrays.toString(vetor));

        for (int i = 0; i < vetor.length; i++) {
            int menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            int n = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = n;
            System.out.println("laço " + i + ": " + Arrays.toString(vetor));
        }

        System.out.println("vetor final: " + Arrays.toString(vetor));
        System.out.println("");

    }

}
