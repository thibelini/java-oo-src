package aula_07_1_construtor;

/**
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 24 de jul de 2018 19:11:08
 * @version 1.0
 */

public class Categoria{
	private Long id;
	private String nome;

	/** Método Construtor Padrao */
	public Categoria(){
		System.out.println( "Constrtutor Padrão" );
	}

	/** Método Construtor Customizado */
	public Categoria( String nome ){
		System.out.println( "Constrtutor Customizado" );
		setNome( nome );
	}

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
		texto.append( " | Nome: " );
		texto.append( nome );
		return texto.toString();
	}
}
