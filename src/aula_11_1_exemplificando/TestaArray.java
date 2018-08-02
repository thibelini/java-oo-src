package aula_11_1_exemplificando;

import java.util.ArrayList;
import java.util.HashSet;

public class TestaArray{

	public static void main( String[ ] args ) {

		Produto produto = new Produto();
		produto.setCodigo( 1 );
		produto.setNome( "Cerveja" );
		produto.setPreco( 23.90 );
		produto.setUnidadeMedida( "Fardo" );

		Produto produto1 = new Produto();
		produto1.setCodigo( 1 );
		produto1.setNome( "Refrigerante 2 litros" );
		produto1.setPreco( 4.50 );
		produto1.setUnidadeMedida( "UN" );

		Produto produto2 = new Produto();
		produto2.setCodigo( 1 );
		produto2.setNome( "Agua" );
		produto2.setPreco( 2 );
		produto2.setUnidadeMedida( "UN" );

		System.out.println( "******** ArrayList ********" );
		ArrayList< Produto > produtosArrayList = new ArrayList< Produto >();
		produtosArrayList.add( produto );
		produtosArrayList.add( produto1 );
		produtosArrayList.add( produto2 );

		System.out.println( "====== For Normal ======" );
		for ( int i = 0; i < produtosArrayList.size(); i++ ) {
			System.out.println( produtosArrayList.get( i ).toString() );
		}
		System.out.println( "====== For Normal ======" );

		System.out.println( "====== For Each ======" );
		for ( Produto produtoCorrente : produtosArrayList ) {
			System.out.println( produtoCorrente );
		}
		System.out.println( "====== For Each ======" );
		System.out.println( "******** ArrayList ********" );

		System.out.println( System.lineSeparator() );

		System.out.println( "******** HashSet ********" );
		HashSet< Produto > produtosHashSet = new HashSet< Produto >();
		produtosHashSet.add( produto );
		produtosHashSet.add( produto1 );
		produtosHashSet.add( produto2 );

		System.out.println( "====== For Normal ======" );
		for ( int i = 0; i < produtosHashSet.size(); i++ ) {
			System.out.println( produtosHashSet );
		}
		System.out.println( "====== For Normal ======" );

		System.out.println( "====== For Each ======" );
		for ( Produto produtoCorrente : produtosHashSet ) {
			System.out.println( produtoCorrente );
		}
		System.out.println( "====== For Each ======" );
		System.out.println( "******** HashSet ********" );

	}

}
