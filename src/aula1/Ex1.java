/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author cg3034593
 */
public class Ex1 {

    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.print(":");        
        n = sc.nextInt();
        
        int vetor[] = new int[n];
        
        for(int i = 0; i<n; i++){
            System.out.print("digite um numero para inserir no vetor:");
            int num = sc.nextInt();
            vetor[i] = num;
        }
        
        System.out.println("");
        
        for(int i = 0; i<n; i++){
            System.out.print(vetor[i]);
        }
        
        System.out.println("");

        for(int i = n - 1; i>=0; i--){
          
            System.out.print(vetor[i]);
        }
        
        
        
        
        
        
        
        
        
    }
    
}
