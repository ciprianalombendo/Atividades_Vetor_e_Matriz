package br.com.generation.matrizes;

import java.util.Scanner;

public class ExemploMatriz03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int [][] n1 = new int [2][3];
        int [][] n2 = new int [2][3]; 
        int [][] m1 = new int [2][3];
        int [][] m2 = new int [2][3];
        int l,c;

		for(l=0;l<2;l++){
			for(c=0;c<3;c++){
				System.out.print("Entre com N1:");
				n1[l][c] = leia.nextInt();
				System.out.print("Entre com N2:");
				n2[l][c] = leia.nextInt();
	
		m1[l][c] = n1[l][c] + n2[l][c];
		m2[l][c] = n1[l][c] - n2[l][c];
			}
		}
		for(l=0;l<2;l++){
			for(c=0;c<3;c++){
				System.out.print("\nMatriz M1: " + m1[l][c]);
				System.out.print("\nMatriz M2: " + m2[l][c]);
				System.out.print("");
	
			}
	
		}
	}
}
