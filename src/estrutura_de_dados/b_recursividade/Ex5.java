package estrutura_de_dados.b_recursividade;

//

import java.util.Random;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int tamanhoVetor;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("qual o tamanho do vetor?:");
        tamanhoVetor = sc.nextInt();
        int vetor[] = new int[tamanhoVetor];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(1000) + 1;
        }

        System.out.print("[");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i] + ", ");
        }
        System.out.print("]");

        System.out.println("");



        System.out.println("menor:"+ retornaMenorIndice2Params(vetor, 0));
        System.out.println("maior:" + retornaMenorIndice3Params(vetor, 0, 0));
    }

    private static int retornaMenorIndice2Params(int vetor[], int count) {
        if (count == vetor.length - 1) {
            return vetor[count];
        }
        int proximoNumero = retornaMenorIndice2Params(vetor, count + 1);
        if (vetor[count] < proximoNumero) {
            return vetor[count];
        } else {
            return proximoNumero;
        }
    }

    private static int retornaMenorIndice3Params(int vetor[], int count, int maior) {
        if (count == vetor.length - 1) {
            return maior;
        } else if (vetor[count] > maior) {
            maior = vetor[count];
        }
        return retornaMenorIndice3Params(vetor, count + 1, maior);


    }

}
