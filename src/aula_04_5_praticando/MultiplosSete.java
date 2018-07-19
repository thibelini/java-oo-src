package aula_04_5_praticando;

/**
 * Criar uma classe que exiba a soma de todos os numero múltiplos de 7
 * no intervalo de 55 a 1587;
 * Utilize o For.
 * 
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 18 de jul de 2018 22:24:46
 * @version 1.0
 */

public class MultiplosSete{

	public static void main( String[ ] args ) {
		int soma = 0;
		for ( int i = 55; i <= 1587; i++ ) {
			if ( i % 7 == 0 ) {
				soma = soma + i;
			}
		}

		System.out.println( "A Soma é " + soma );

	}

}
