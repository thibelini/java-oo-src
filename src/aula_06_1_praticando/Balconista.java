package aula_06_1_praticando;

/**
 * 
 * Classe que representa
 *
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 23 de jul de 2018 20:51:13
 * @version 1.0
 */
public class Balconista{
	private String nome;
	private String sexo;
	private String cidade;

	public String getNome() {
		return nome;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo( String sexo ) {
		this.sexo = sexo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade( String cidade ) {
		this.cidade = cidade;
	}

	public String getDados() {
		StringBuilder texto = new StringBuilder();
		texto.append( "Nome: " );
		texto.append( nome );
		texto.append( " - Sexo: " );
		texto.append( sexo );
		texto.append( " - Cidade: " );
		texto.append( cidade );
		return texto.toString();
	}

}
