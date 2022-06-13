package heranca01;

public class cachorro extends Animal{

private String correr;
	
	public cachorro(String nome, int idade, String som, String correr)
	{
		super(nome, idade, som);
		this.correr = correr;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cachorro: " +getNome()+ "\nIdade: " +getIdade()+ "\nEmite o Som de: " +getSom()+ "\nDeve: " +correr);
	}

	public String getcorrer() {
		return correr;
	}

	public void setAcao(String correr) {
		this.correr = correr;
	}
	
}