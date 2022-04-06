package br.com.generation.vetores;

import java.util.Scanner;

public class ExemploVetor04 {

	public static void main(String[] args) {

		Scanner entradaVetor = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do vetor: ");
		int tamanhoVetor = entradaVetor.nextInt();
		
		int[] vetor = new int[tamanhoVetor];
		
		for(int i = 0; i < tamanhoVetor; i++); {
			System.out.println("Digite os valores dentro do Vetor: ");
			vetor[1] = entradaVetor.nextInt();
		}
		for(int i = 0; i <=3; i++) {
			System.out.println("Posição: " + (i) + "° " + vetor[i]);

		}
		
	}

}
