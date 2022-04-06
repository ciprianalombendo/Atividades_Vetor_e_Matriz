package br.com.generation.vetores;

import java.util.Scanner;

public class ExemploVetor05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int i;
		double maiorNota = 0.0;
		double[] vetorNota = new double[5]; 

		for(i = 0; i < 5; i++){
			System.out.println("Digite a nota: ");
			
			//colocando a nota na posição da iteração
			vetorNota[i] = leia.nextDouble();
		}

		// acessando os valores do vetor Nota:
		for(i = 0; i < 5; i++){
			
			//escrevendo na tela os valores do vetorNota
			//escreva("\n", vetorNota[iteracao])

			if(vetorNota[i] > maiorNota){ 
				maiorNota = vetorNota[i];
				
			}
		}
		System.out.println("\nA maior nota do aluno é: " + maiorNota);
	}

}
