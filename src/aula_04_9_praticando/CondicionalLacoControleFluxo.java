package aula_04_9_praticando;

/**
 * Criar uma classe que exiba a o resultado da subtração entre, a soma de todos os números impares e a soma de todos os números pares, ambos no intervalo de 584 a 98725.
 * Porem o limite logico do for deverá ser de 100000.
 *
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 19 de jul de 2018 19:51:05
 * @version 1.0
 */

public class CondicionalLacoControleFluxo{

	public static void main( String[ ] args ) {
		int somaPar = 0;
		int somaImpar = 0;

		for ( int i = 584; i <= 100000; i++ ) {

			if ( i % 2 == 0 ) {
				somaPar += i;
				continue;
			}

			somaImpar += i;

			if ( i >= 98725 ) {
				break;
			}
		}

		System.out.println( "A Subtração é " + ( somaImpar - somaPar ) );

	}

}
