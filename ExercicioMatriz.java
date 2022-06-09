package br.com.generation.vetor;

import java.util.Scanner;

/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
public class ExercicioMatriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double[][] numeros = new double[3][3]; 
		
		double soma = 0, somadiagonal = 0; 

		for (int l=0; l<=2; l++){
			
			for (int c=0; c<=2; c++){
				System.out.println("Escreva o numero: "); 
				numeros[l][c] = entrada.nextDouble(); 
				//soma = soma + numeros[l][c]; }
				soma = numeros[l][c]; }
			
			    System.out.printf("Soma dos numeros: " , soma); {
			    }
				soma = numeros[0][0] + numeros[1][1] + numeros[2][2];
				System.out.printf("Soma dos numeros: " , soma);{
				}
		}
	}

}
