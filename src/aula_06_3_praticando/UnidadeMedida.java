package aula_06_3_praticando;

/**
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 24 de jul de 2018 19:16:36
 * @version 1.0
 */
public class UnidadeMedida{
	private Long id;
	private String nome;
	private String sigla;

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

	public String getSigla() {
		return sigla;
	}

	public void setSigla( String sigla ) {
		this.sigla = sigla;
	}

	public String getDados() {
		StringBuilder texto = new StringBuilder();
		texto.append( "Id: " );
		texto.append( id );
		texto.append( " | Nome: " );
		texto.append( nome );
		texto.append( " | Sigla: " );
		texto.append( sigla );
		return texto.toString();
	}

}
