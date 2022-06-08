package ExerciciosDeRepeticao;
/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.*/

import java.util.Scanner;

public class ExerFor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int cont, numero, par = 0, impar = 0;
		
		
		for (cont = 0; cont <10; cont++) {
		
			System.out.println("Insira um numero: ");
			numero = ler.nextInt();
			
			if(numero % 2 == 0) {
				par ++; }
			
			else {
				impar ++; }
		}
		
		System.out.println("Foram inseridos " +par+ " números pares e " +impar+ " números ímpares.");
		
		
		
		
		
		
		
		
		
		
		
	}

}
