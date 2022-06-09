package turma54aula02;

import java.util.Scanner;

public class ExerAnos {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			
			int idade, m, d, resul;
			
			System.out.println("Informe a sua Idade:");
			idade = leia.nextInt();
			
			System.out.println("Informe os Meses:");
			m = leia.nextInt();
			
			System.out.println("Informe os Dias:");
			d = leia.nextInt();
					
			resul = idade * 365 + m * 30 + d;
							
			System.out.println("\nSua Idade expressa em Dias é de: "+resul);
			
		}

	}