package ExerciciosDeRepeticao;
/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados*/

import java.util.Scanner;

public class ExerDoWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int numero, soma = 0;
		
		do {
			System.out.println("Insira um número: ");
			numero = ler.nextInt();
			soma += numero; }
		
		while (numero != 0); 
		
		System.out.println("A soma foi: " + soma);
		
		
		
		
	}

}
