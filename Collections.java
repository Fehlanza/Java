package collections.gen;

import java.util.ArrayList;
import java.util.Scanner;

/*3- Crie uma um programa para trabalhar com estoque de uma loja, o programa dever� trabalhar 
 com Collection do tipo List do Java para manipular os dados desse estoque, 
 o programa dever� atender as seguintes funcionalidades:Armazenar dados da List, remover dados da list, atualizar dados da list e apresentar todos os dados da list.*/
public class Collections {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int op;
		ArrayList<String> estoque = new ArrayList();
		
		System.out.println("*** Bijus da Feh ***");
		do
		{
			System.out.println("\n(1) Adicionar produtos ao estoque: ");
			System.out.println("(2) Remover produtos do estoque: ");
			System.out.println("(3) Atualizar produtos do estoque: ");
			System.out.println("(4) Mostrar o estoque: ");
			System.out.println("(0) Encerrar o programa. ");
			System.out.println("========================================");
			System.out.println("Digite sua op��o: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("Informe o produto que ser� adicionado: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("Informe o Produto que ser� removido: ");
				String produto1 = leia.nextLine();
				
				if(estoque.contains(produto1))
				{
					estoque.remove(produto1);
				}
				else
				{
					System.out.println("Produto n�o cadastrado!");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("Informe o produto que deseja atualizar: ");
				String atualizar = leia.nextLine();
				System.out.println("Informe o produto que ir� substitui-lo: " +atualizar+ " : ");
				String novo = leia.nextLine();
				
				if(estoque.contains(atualizar))
				{
					estoque.remove(atualizar);
					estoque.add(novo);
				}
				else
				{
					System.out.println("Produto n�o cadastrado!");
					System.out.println("\n" +estoque);
					break;
				}
			case 4:
				System.out.println("O estoque est� composto pelos produtos: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("Finalizado!");
			}						
		}while(op != 0);
	}
}
