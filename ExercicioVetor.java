package br.com.generation.vetor;

import java.util.Scanner;

/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/

public class ExercicioVetor {

	Scanner entradaPontucao = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		double[] arraypontuacao = new double[5];
		
		double maiorpontuacao = 0.0;
		

				System.out.println("::::: SISTEMA DE PONTUA��ES ::::");
				System.out.println("DIGITE A PONTUA��O: ");
				Scanner entradaPontuacao;
				

				for (int i = 0; i <=4; i++){
					System.out.println((i+1) + "- Pontua��o: ");
					arraypontuacao[i] = entradaPontuacao.nextDouble();
					
					
					if (arraypontuacao [i] > maiorpontuacao){
					maiorpontuacao = arraypontuacao [i];}; ;} 
				
				System.out.println("A maior pontua��o foi " + maiorpontuacao);
			
			}
		}