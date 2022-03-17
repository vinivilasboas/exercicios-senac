package com.senac;

import java.util.Scanner;

/**
 *
 * @author vinivilasboas
 */

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos números serão lidos? ");
        int N = scan.nextInt();
        int[] vetor = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("\nValor a ser alocado no vetor[" + i + "]: ");
            vetor[i] = scan.nextInt();
        }
        int menor = vetor[0];
        int maior = vetor[0];
        for (int i = 0; i < N; i++) {
            if (vetor [i] < menor) menor = vetor[i];
            if (vetor [i] > maior) maior = vetor[i];
        }
        boolean crescente = true;
        for (int i = 1; i < N; i++) {
            if (vetor[i - 1] > vetor [i]) crescente = false;
        }
        System.out.println("maior diferença entre dois elementos distintos do vetor: " + (maior - menor));
        System.out.println(crescente);
    }
}
