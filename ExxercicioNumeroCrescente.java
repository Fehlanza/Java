package ExercicioAula03;

import java.util.Scanner;

public class ExxercicioNumeroCrescente {

	//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int num1, num2, num3;
		
		System.out.println("Digite um n�mero inteiro: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite outro n�mero inteiro: ");
		num2 = ler.nextInt();
		
		System.out.println("Digite mais um n�mero inteiro: ");
		num3 = ler.nextInt();
		
		if(num1>= num2 && num1>= num3) {
			System.out.println("\nO n�mero " + num1 + " � o maior numero"); }
		
		else if (num2>= num1 && num2>= num3) {
			System.out.println("\nO n�mero " + num2 + " � o maior numero"); }
		
		else if (num3>= num1 && num3>= num2) {
			System.out.println("\nO n�mero " + num3 + " � o maior numero"); }
		
		else {
			System.out.println("\nVoc� digitou um n�mero inv�lido");}

	}

}
