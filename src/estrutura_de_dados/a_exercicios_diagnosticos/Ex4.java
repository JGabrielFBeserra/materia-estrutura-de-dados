/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_de_dados.a_exercicios_diagnosticos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author cg3034593
 */
public class Ex4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String arqLeitura = "numeros.txt";

        BufferedReader buffRead = new BufferedReader(new FileReader(arqLeitura));

        System.out.println("Lendo o arquivo " + arqLeitura);

        String linha = buffRead.readLine();
        System.out.println("tamanho vetor: " + linha);
        int tamanhoVetor = Integer.parseInt(linha);
        int vetor[] = new int[tamanhoVetor];
        linha = buffRead.readLine();
        int i = 0;
        while (linha != null) {
            vetor[i] = Integer.parseInt(linha);
            System.out.println(linha);
            linha = buffRead.readLine();
            i++;
        }
        buffRead.close();

        System.out.print("[");
        for (int j = 0; j < tamanhoVetor; j++) {
            System.out.print(vetor[j] + " ");
        }
        System.out.print("]");

        System.out.println("");

        System.out.print("[");
        for (int k = tamanhoVetor - 1; k >= 0; k--) {

            System.out.print(vetor[k] + " ");
        }
        System.out.print("]");

        String arqEscrita = "numero_invertivo.txt";
        System.out.println("Escrevendo no arquivo " + arqEscrita);
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(arqEscrita, true));
        for (int k = tamanhoVetor - 1; k >= 0; k--) {
            buffWrite.append(vetor[k] + "\n");

        }
        buffWrite.close();

    }

}
