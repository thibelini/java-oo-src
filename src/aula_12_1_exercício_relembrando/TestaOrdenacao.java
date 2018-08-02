package aula_12_1_exercício_relembrando;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaOrdenacao{

	public static void main( String[ ] args ) {

		Produto produto = new Produto();
		produto.setCodigo( 20 );
		produto.setNome( "Cerveja" );
		produto.setPreco( 23.90 );
		produto.setUnidadeMedida( "Fardo" );

		Produto produto1 = new Produto();
		produto1.setCodigo( 1 );
		produto1.setNome( "Refrigerante 2 litros" );
		produto1.setPreco( 1.50 );
		produto1.setUnidadeMedida( "UN" );

		Produto produto2 = new Produto();
		produto2.setCodigo( 8 );
		produto2.setNome( "Agua" );
		produto2.setPreco( 2 );
		produto2.setUnidadeMedida( "UN" );

		System.out.println( "******** ArrayList ********" );
		ArrayList< Produto > produtosArrayList = new ArrayList< Produto >();
		produtosArrayList.add( produto );
		produtosArrayList.add( produto1 );
		produtosArrayList.add( produto2 );

		System.out.println( "====== Exibindo a Forma Original ======" );
		for ( Produto produtoCorrente : produtosArrayList ) {
			System.out.println( produtoCorrente );
		}

		/** Ordenando com Base na interface Comparable */
		System.out.println( "====== Ordenacao Preco ASC ======" );
		Collections.sort( produtosArrayList );
		for ( Produto produtoCorrente : produtosArrayList ) {
			System.out.println( produtoCorrente );
		}

		/** Revertendo a ordenacao da Lista Atual */
		System.out.println( "====== Ordenacao Preco DESC ======" );
		Collections.reverse( produtosArrayList );
		for ( Produto produtoCorrente : produtosArrayList ) {
			System.out.println( produtoCorrente );
		}

		System.out.println( "====== Ordenacao Inversa do CompareTO ======" );
		Collections.reverseOrder();
		Collections.sort( produtosArrayList, Collections.reverseOrder() );
		for ( Produto produtoCorrente : produtosArrayList ) {
			System.out.println( produtoCorrente );
		}

		/** Criando regra de Ordenação usando classe anonima */
		System.out.println( "Criando regra de Ordenação usando classe anonima" );
		Collections.sort( produtosArrayList, new Comparator< Produto >(){
			/** Aqui estamos dentro do escopo de uma classe que implementa a interface Comparator<T> (Classe Anonima) */
			@Override
			public int compare( Produto o1, Produto o2 ) {
				if ( o1.getCodigo() > o2.getCodigo() ) {
					return 1;
				} else if ( o1.getCodigo() < o2.getCodigo() ) {
					return -1;
				}
				return 0;
			}
		} );

		Collections.sort( produtosArrayList, Collections.reverseOrder() );
		for ( Produto produtoCorrente : produtosArrayList ) {
			System.out.println( produtoCorrente );
		}

	}

}
