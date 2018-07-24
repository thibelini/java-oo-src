package aula_06_2_praticando;

import java.math.BigDecimal;

/**
 * 
 * Implemente o Diagrama de Classe abaixo;
 * Crie a Classe TestaRelacionamento, e nela instancie as classe e preencha seus atributos.
 * Por fim exiba no console os dados do Produto e de sua Categoria;
 * Exiba o nome da Categoria do Produto separadamente.
 * 
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 23 de jul de 2018 22:29:13
 * @version 1.0
 */

public class TestaRelacionamento{

	public static void main( String[ ] args ) {
		Categoria categoria = new Categoria();
		categoria.setId( new Long( "10" ) );
		categoria.setNome( "Bebida" );

		Produto produto = new Produto();
		produto.setId( new Long( "1" ) );
		produto.setNome( "Guarana" );
		produto.setDescricao( "Feito um fruta natural" );
		produto.setValor( new BigDecimal( "3.99" ) );
		produto.setCategoria( categoria );
		System.out.println( "Produto: " + produto.getDados() );
		System.out.println( "Categoria: " + produto.getCategoria().getDados() );
	}

}
