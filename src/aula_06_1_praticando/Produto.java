package aula_06_1_praticando;

import java.math.BigDecimal;

public class Produto{

	private Integer codigo;
	private String nome;
	private BigDecimal preco;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo( Integer codigo ) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco( BigDecimal preco ) {
		this.preco = preco;
	}

	public String getDados() {
		StringBuilder texto = new StringBuilder();
		texto.append( "Codigo: " );
		texto.append( codigo );
		texto.append( " - Nome: " );
		texto.append( nome );
		texto.append( " - Preço: " );
		texto.append( preco );
		return texto.toString();
	}

}
