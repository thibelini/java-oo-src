package aula_08_6_praticando;

public class Pessoa{

	private String nome;
	private String cpf;

	public Pessoa( String nome ){
		System.out.println( "Pessoa" );
		setNome( nome );
	}

	public String getNome() {
		return nome;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf( String cpf ) {
		this.cpf = cpf;
	}

}
