package aula_08_1_praticando;

/**
 * 
 * Classe que representa
 *
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 26 de jul de 2018 19:17:08
 * @version 1.0
 */

public class Cliente{

	private Long id;
	private String nome;
	private String cpf;
	private String cidade;
	private String uf;

	public Cliente(){

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf( String cpf ) {
		this.cpf = cpf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade( String cidade ) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf( String uf ) {
		this.uf = uf;
	}

	public String getDados() {
		StringBuilder texto = new StringBuilder();
		texto.append( "Id do Cliente: " );
		texto.append( id );
		texto.append( " | Nome: " );
		texto.append( nome );
		texto.append( " | CPF: " );
		texto.append( cpf );
		texto.append( " | Cidade: " );
		texto.append( cidade );
		texto.append( "/" );
		texto.append( uf );
		return texto.toString();
	}

}
