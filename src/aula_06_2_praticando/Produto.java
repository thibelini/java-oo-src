package aula_06_2_praticando;

import java.math.BigDecimal;

public class Produto{

	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal valor;
	private Categoria categoria;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao( String descricao ) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor( BigDecimal valor ) {
		this.valor = valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria( Categoria categoria ) {
		this.categoria = categoria;
	}

	public String getDados() {
		StringBuilder texto = new StringBuilder();
		texto.append( "Id: " );
		texto.append( id );
		texto.append( " - Nome: " );
		texto.append( nome );
		texto.append( " - Descrição: " );
		texto.append( descricao );
		texto.append( " - Valor: " );
		texto.append( valor );
		texto.append( " - Categoria: " );
		texto.append( categoria.getDados() );
		return texto.toString();
	}

}
