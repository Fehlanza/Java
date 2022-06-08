package ExercicioAula03;

import java.util.Scanner;

public class ExercicioNumeroCrescente02 {

	//Faça um programa que entre com três números e coloque em ordem crescente.
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int A, B, C;
		
		System.out.println("Digite um número: ");
		A = ler.nextInt();
		
		System.out.println("Digite outro número: ");
		B = ler.nextInt();
		
		System.out.println("Digite mais um número: ");
		C = ler.nextInt();
		
		if(A> B && A> C && B> C) {
			System.out.println("\nA ordem crescente é " + A + "," + B + " e "+ C); }
		
		else if (A> B && A> C && C> B) {
			System.out.println("\nA ordem crescente é " + A + "," + C + " e "+ B); }
		
		else if (B> A && B> C && A> C) {
			System.out.println("\nA ordem crescente é " + B + "," + A + " e " + C); }
		
		else if (B> A && B> C && C> A) {
			System.out.println("\nA ordem crescente é " + B + "," + C + " e " + A); }
		
		else if (C> A && C> B && A> B) {
			System.out.println("\nA ordem crescente é " + C + "," + A + " e " + B); }
		
		else if (C> A && C> B && B> A) {
			System.out.println("\nA ordem crescente é " + C + "," + B + " e " + A); }
		
		else {
			System.out.println("\nVocê digitou um número inválido");}

	}

}