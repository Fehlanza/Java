package ExercicioAula03;

import java.util.Scanner;

public class ExercicioLacoIdade {
	
 /* Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
 categoria ela se encontra:
	  10-14 infantil
	  15-17 juvenil
	  18-25 adulto*/
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int idade; 
		
		System.out.println("Qual a sua idade? ");
		idade = ler.nextInt();
		
		if(idade>=18 && idade<=25) {
			System.out.println("\nVocê é adulto"); }
		
		else if (idade>=15 && idade<=17) {
			System.out.println("\nVocê é juvenil");}
		
		else if (idade>=10 && idade<=14) {
			System.out.println("\nVocê é infantil");}
		
		else {
			System.out.println("\nVocê entrou com uma idade inválida");}
	}

}
