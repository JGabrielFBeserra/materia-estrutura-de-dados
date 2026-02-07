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
public class Ex3 {
    
    public static void main(String[] args) {
        int tamanhoVetor;

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("qual o tamanho do vetor?:");
        tamanhoVetor = sc.nextInt();

        int vetor[] = new int[tamanhoVetor];
        
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i]);
        }
        
        System.out.println("");

        for (int i = 0; i < tamanhoVetor; ) {
            int numero = random.nextInt(tamanhoVetor) + 1;
            boolean resposta = insereExclusivo(vetor, numero);
            if(resposta) {
                vetor[i] = numero;     
                i = i+1;
            }             
        }
        
      

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i]);
        }
        
    }
    
    private static boolean insereExclusivo(int vetor[], int numero) {
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] == numero) {
            return false;
        }
    }
        
        return true;
    }
    
  
}
