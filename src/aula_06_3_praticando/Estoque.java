package aula_06_3_praticando;

import java.math.BigDecimal;

/**
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 24 de jul de 2018 19:27:34
 * @version 1.0
 */

public class Estoque{
	private Long id;
	private BigDecimal quantidade;
	private Produto produto;

	public Long getId() {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade( BigDecimal quantidade ) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto( Produto produto ) {
		this.produto = produto;
	}

	public String getDados() {
		StringBuilder texto = new StringBuilder();
		texto.append( "id: " );
		texto.append( id );
		texto.append( " | Quantidade: " );
		texto.append( quantidade );
		texto.append( "\nProduto: " );
		texto.append( produto.getDados() );
		return texto.toString();
	}

}
