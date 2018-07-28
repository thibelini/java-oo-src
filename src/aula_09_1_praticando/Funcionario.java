package aula_09_1_praticando;

public class Funcionario{

	private String nome;

	public Funcionario( String nome ){
		setNome( nome );
	}

	public String getNome() {
		return nome;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public void atender() {
		System.out.println( "Funcionário: " + getNome() + "do Cargo Indefinido | SRC Boa tarde" );
	}

}
