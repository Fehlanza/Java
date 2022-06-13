package heranca01;

public class Preguica extends Animal{

private String correr02;
	
	public Preguica (String nome, int idade, String som, String correr02)
	{
		super(nome, idade, som);
		this.correr02 = correr02;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cachorro: " +getNome()+ "\nIdade: " +getIdade()+ "\nEmite o Som de: " +getSom()+ "\nDeve: " +correr02);
	}

	public String getcorrer() {
		return correr02;
	}

	public void setAcao(String correr02) {
		this.correr02 = correr02;
	}
	
}