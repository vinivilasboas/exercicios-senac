package com.senac.ordenacaosofisticada;

import java.util.Arrays;

public class ExercicioQuickSort {

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
            int pivot = divide(vetor, inicio, fim);
            sort(vetor, inicio, pivot - 1);
            sort(vetor, pivot + 1, fim);
            System.out.printf("Passo recursivo: %s\n", Arrays.toString(vetor));
        }

    }

    public static int divide (int[] vetor, int inicio, int fim) {

        int pivot = vetor[inicio];
        int posPivot = inicio;

        for (int i = inicio + 1; i <= fim; i++) {
            if(vetor[i] < pivot) {
                vetor[posPivot] = vetor[i];
                vetor[i] = vetor[posPivot + 1];
                posPivot++;
            }
        }

        vetor[posPivot] = pivot;
        return posPivot;

    }

}
