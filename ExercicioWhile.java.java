package ExerciciosDeRepeticao;

import java.util.Scanner;

public class ExercWhile {
	/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99. (WHILE)*/
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int idade, total21 = 0, total50 = 0;
		
		System.out.println("Insira a sua idade: ");
		idade = ler.nextInt();
			
		while(idade != -99) {
		
			if(idade < 21){
				total21 ++;	}		
				
			else if(idade > 50) {
				total50 ++;	}
			
			System.out.println("Insira a sua idade: ");
			idade = ler.nextInt();
			System.out.println("(Digite -99 para Encerrar)");
		}
			System.out.println("\nTemos " +total21+ " pessoa com menos de 21 Anos e " +total50 + " pessoas com mais de 50 anos");
			

	}}		
