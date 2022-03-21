package com.senac.ordenacaosimples;

import java.util.Arrays;

/**
 *
 * @author vinivilasboas
 */

public class ExercicioBubbleSort {

    public static void main(String[] args) {

        int[] vetorA = {36, 15, 75, 2, 16, 48, 42, 51};

        bubbleSort(vetorA);

        int[] vetorB = {13, 45, 38, 20, 23, 7, 6, 5, 10, 11};

        bubbleSort(vetorB);

        int[] vetorC = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        bubbleSort(vetorC);

    }

    public static void bubbleSort (int[] vetor) {

        System.out.println("vetor inicial: " + Arrays.toString(vetor));

        boolean teste = true;

        for (int i = 0; i < vetor.length && teste; i++) {
            teste = false;
            int n;
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    n = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = n;
                    teste = true;
                }
            }
            System.out.println("laço " + i + ": " + Arrays.toString(vetor));
        }

        System.out.println("vetor final: " + Arrays.toString(vetor));
        System.out.println("");

    }

}
