package ExercicioAula03;

import java.util.Scanner;

public class ExercicioNumeroCrescente02 {

	//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int A, B, C;
		
		System.out.println("Digite um n�mero: ");
		A = ler.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		B = ler.nextInt();
		
		System.out.println("Digite mais um n�mero: ");
		C = ler.nextInt();
		
		if(A> B && A> C && B> C) {
			System.out.println("\nA ordem crescente � " + A + "," + B + " e "+ C); }
		
		else if (A> B && A> C && C> B) {
			System.out.println("\nA ordem crescente � " + A + "," + C + " e "+ B); }
		
		else if (B> A && B> C && A> C) {
			System.out.println("\nA ordem crescente � " + B + "," + A + " e " + C); }
		
		else if (B> A && B> C && C> A) {
			System.out.println("\nA ordem crescente � " + B + "," + C + " e " + A); }
		
		else if (C> A && C> B && A> B) {
			System.out.println("\nA ordem crescente � " + C + "," + A + " e " + B); }
		
		else if (C> A && C> B && B> A) {
			System.out.println("\nA ordem crescente � " + C + "," + B + " e " + A); }
		
		else {
			System.out.println("\nVoc� digitou um n�mero inv�lido");}

	}

}