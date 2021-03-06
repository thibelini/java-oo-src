package aula_06_2_praticando;

public class Categoria{

	private Long id;
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public String getDados() {
		StringBuilder texto = new StringBuilder();
		texto.append( "Id: " );
		texto.append( id );
		texto.append( " - Nome: " );
		texto.append( nome );
		return texto.toString();
	}

}
