package ExercicioAula03;

import java.util.Scanner;

public class ExxercicioNumeroCrescente {

	//Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int num1, num2, num3;
		
		System.out.println("Digite um número inteiro: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		num2 = ler.nextInt();
		
		System.out.println("Digite mais um número inteiro: ");
		num3 = ler.nextInt();
		
		if(num1>= num2 && num1>= num3) {
			System.out.println("\nO número " + num1 + " é o maior numero"); }
		
		else if (num2>= num1 && num2>= num3) {
			System.out.println("\nO número " + num2 + " é o maior numero"); }
		
		else if (num3>= num1 && num3>= num2) {
			System.out.println("\nO número " + num3 + " é o maior numero"); }
		
		else {
			System.out.println("\nVocê digitou um número inválido");}

	}

}
