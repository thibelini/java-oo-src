package aula_06_3_praticando;

import java.math.BigDecimal;

/**
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 24 de jul de 2018 19:33:26
 * @version 1.0
 */

public class TestaReferencia{

	public static void main( String[ ] args ) {

		Estoque estoque = new Estoque();
		estoque.setId( Long.valueOf( 1 ) );
		estoque.setQuantidade( new BigDecimal( "250" ) );

		estoque.setProduto( new Produto() );
		estoque.getProduto().setId( Long.valueOf( 1 ) );
		estoque.getProduto().setNome( "Açai" );
		estoque.getProduto().setDescricao( "Açai Sabor natural + guarana" );
		estoque.getProduto().setValor( new BigDecimal( "12.90" ) );

		estoque.getProduto().setCategoria( new Categoria() );
		estoque.getProduto().getCategoria().setId( Long.valueOf( 1 ) );
		estoque.getProduto().getCategoria().setNome( "Energético" );

		estoque.getProduto().setUnidadeMedida( new UnidadeMedida() );
		estoque.getProduto().getUnidadeMedida().setId( Long.valueOf( 1 ) );
		estoque.getProduto().getUnidadeMedida().setNome( "Unidade" );
		estoque.getProduto().getUnidadeMedida().setSigla( "UN" );
		System.out.println( estoque.getDados() );

		/* Classe Categoria 
		Categoria categoria = new Categoria();
		categoria.setId( Long.valueOf( "1" ) );
		categoria.setNome( "Papelaria" );
		
		 Classe Unidade 
		UnidadeMedida unidadeMedida = new UnidadeMedida();
		unidadeMedida.setId( Long.valueOf( "5" ) );
		unidadeMedida.setNome( "Unidade" );
		unidadeMedida.setSigla( "UN" );
		
		 Classe Produto 
		Produto produto = new Produto();
		produto.setId( Long.valueOf( "10" ) );
		produto.setNome( "Lapis Preto" );
		produto.setDescricao( "Lapis de Madeira com Grafite" );
		produto.setValor( new BigDecimal( "3.99" ) );
		produto.setCategoria( categoria );
		produto.setUnidadeMedida( unidadeMedida );
		
		 Classe Estoque 
		Estoque estoque = new Estoque();
		estoque.setId( Long.valueOf( "3" ) );
		estoque.setQuantidade( new BigDecimal( "20" ) );
		estoque.setProduto( produto );
		System.out.println( "Estoque: " + estoque.getDados() );*/

	}

}
