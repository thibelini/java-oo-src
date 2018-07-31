package aula_08_2_praticando;

/**
 * 
 * Classe que representa
 *
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 26 de jul de 2018 20:54:53
 * @version 1.0
 */

public class Aluno{

	public String nome;
	public double nota;
	public static double media;

	public String getDados() {
		StringBuffer texto = new StringBuffer();
		texto.append( "Nome: " );
		texto.append( nome );
		texto.append( System.lineSeparator() );
		texto.append( "Nota: " );
		texto.append( nota );
		texto.append( System.lineSeparator() );
		texto.append( "Média Aprovação: " );
		texto.append( media );
		return texto.toString();
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

}
