package com.senac.ordenacaosofisticada;

import java.util.Arrays;

/**
 *
 * @author vinivilasboas
 */

public class ExercicioMergeSort {

    public static void main(String[] args) {

        int[] vetorA = {36, 15, 75, 2, 16, 48, 42, 51};

        System.out.println("vetor inicial: " + Arrays.toString(vetorA));
        sort(vetorA, 0, vetorA.length - 1);
        System.out.println("vetor final: " + Arrays.toString(vetorA));
        System.out.println();

        int[] vetorB = {13, 45, 38, 20, 23, 7, 6, 5, 10, 11};

        System.out.println("vetor inicial: " + Arrays.toString(vetorB));
        sort(vetorB, 0, vetorB.length - 1);
        System.out.println("vetor final: " + Arrays.toString(vetorB));
        System.out.println();

        int[] vetorC = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("vetor inicial: " + Arrays.toString(vetorC));
        sort(vetorC, 0, vetorC.length - 1);
        System.out.println("vetor final: " + Arrays.toString(vetorC));
        System.out.println();

    }

    public static void sort(int[] vetor, int inicio, int fim) {

        if (inicio < fim) {
            int meio = (fim + inicio) / 2;
            sort(vetor, inicio, meio);
            sort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
            System.out.printf("Passo recursivo: %s\n", Arrays.toString(vetor));
        }

    }

    public static void merge(int[] vetor, int inicio, int meio, int fim) {
        int i, esquerda, direita;
        int[] aux = new int[vetor.length];

        for (i = inicio; i <= fim; i++) aux[i] = vetor[i];

        i = inicio;
        esquerda = inicio;
        direita = meio + 1;

        while (esquerda <= meio && direita <= fim) {
            if (aux[esquerda] <= aux[direita]) vetor[i++] = aux[esquerda++];
            else vetor[i++] = aux[direita++];
        }

        while (esquerda <= meio) vetor[i++] = aux[esquerda++];

    }

}
