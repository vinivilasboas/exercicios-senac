package com.senac.ordenacaosimples;

import java.util.Arrays;

public class ExercicioInsertionSort {

    public static void main(String[] args) {

        int[] vetorA = {36, 15, 75, 2, 16, 48, 42, 51};

        insertionSort(vetorA);

        int[] vetorB = {13, 45, 38, 20, 23, 7, 6, 5, 10, 11};

        insertionSort(vetorB);

        int[] vetorC = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        insertionSort(vetorC);

    }

    public static void insertionSort (int[] vetor) {

        System.out.println("vetor inicial: " + Arrays.toString(vetor));

        for (int i = 1; i < vetor.length; i++) {
            int n = vetor[i];
            for (int j = i - 1; j >= 0 && vetor[j] > n; j--) {
                vetor[j + 1] = vetor[j];
                vetor[j] = n;
            }
            System.out.println("laço " + i + ": " + Arrays.toString(vetor));
        }

        System.out.println("vetor final: " + Arrays.toString(vetor));
        System.out.println("");

    }

}
