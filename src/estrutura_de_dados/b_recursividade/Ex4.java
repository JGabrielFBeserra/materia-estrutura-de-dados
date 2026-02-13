package estrutura_de_dados.b_recursividade;

//Crie uma função recursiva que retorne a soma
// dos elementos de um vetor de N inteiros

import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int tamanhoVetor;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("qual o tamanho do vetor?:");
        tamanhoVetor = sc.nextInt();
        int vetor[] = new int[tamanhoVetor];

        for(int i = 0; i<vetor.length; i++){
            vetor[i] = random.nextInt(5)+1;
        }

        System.out.print("[");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i]+", ");
        }
        System.out.print("]");

        System.out.println("");


        System.out.println(calculaVetor(vetor, 0));
    }
    private static int calculaVetor(int vetor[], int count) {
        if(count == vetor.length-1) {
            return vetor[count];

        }

        return vetor[count] + calculaVetor(vetor, count+1);
    }
}
