package br.com.generation.vetor;

import java.util.Scanner;

/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

public class ExercicioVetor {

	Scanner entradaPontucao = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		double[] arraypontuacao = new double[5];
		
		double maiorpontuacao = 0.0;
		

				System.out.println("::::: SISTEMA DE PONTUAÇÕES ::::");
				System.out.println("DIGITE A PONTUAÇÃO: ");
				Scanner entradaPontuacao;
				

				for (int i = 0; i <=4; i++){
					System.out.println((i+1) + "- Pontuação: ");
					arraypontuacao[i] = entradaPontuacao.nextDouble();
					
					
					if (arraypontuacao [i] > maiorpontuacao){
					maiorpontuacao = arraypontuacao [i];}; ;} 
				
				System.out.println("A maior pontuação foi " + maiorpontuacao);
			
			}
		}