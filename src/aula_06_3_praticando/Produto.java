package aula_06_3_praticando;

import java.math.BigDecimal;

/**
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 24 de jul de 2018 19:20:20
 * @version 1.0
 */

public class Produto{
	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal valor;
	private Categoria categoria;
	private UnidadeMedida unidadeMedida;

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

	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida( UnidadeMedida unidadeMedida ) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getDados() {
		StringBuilder texto = new StringBuilder();
		texto.append( "id: " );
		texto.append( id );
		texto.append( " | Nome: " );
		texto.append( nome );
		texto.append( " | Descrição: " );
		texto.append( descricao );
		texto.append( " | Valor: " );
		texto.append( valor );
		texto.append( "\nCategoria: " );
		texto.append( categoria.getDados() );
		texto.append( "\nUnidade Medida: " );
		texto.append( unidadeMedida.getDados() );
		return texto.toString();
	}

}
