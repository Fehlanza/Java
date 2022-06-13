package heranca01;

public class Cavalo extends Animal{

private String correr01;
	
	public Cavalo (String nome, int idade, String som, String correr01)
	{
		super(nome, idade, som);
		this.correr01 = correr01;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cachorro: " +getNome()+ "\nIdade: " +getIdade()+ "\nEmite o Som de: " +getSom()+ "\nDeve: " +correr01);
	}

	public String getcorrer() {
		return correr01;
	}

	public void setAcao(String correr01) {
		this.correr01 = correr01;
	}
	
}