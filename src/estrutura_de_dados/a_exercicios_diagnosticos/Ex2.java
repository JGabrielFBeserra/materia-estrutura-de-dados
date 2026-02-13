/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_de_dados.a_exercicios_diagnosticos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cg3034593
 */
public class Ex2 {

    public static void main(String[] args) {

        int tamanhoVetor;

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("qual o tamanho do vetor?:");
        tamanhoVetor = sc.nextInt();

        int vetor[] = new int[tamanhoVetor];

        System.out.print("vai gerar numero de 0 a ?:");
        int numeroFinal = sc.nextInt();

        for (int i = 0; i < tamanhoVetor; i++) {
            int numero = random.nextInt(numeroFinal);
            vetor[i] = numero;
        }

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i]);
        }
    }

}
