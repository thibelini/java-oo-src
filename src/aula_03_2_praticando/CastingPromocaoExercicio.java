package aula_03_2_praticando;

/**
 * 
 * Descriacao
 * Criar uma classe executável que exibirá o valor inteiro da média entre 8 DOUBLES.
 * Sugestão: Nome da classe --> CastingPromocaoExercicio
 *
 * 
 * Classe que representa
 *
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 18 de jul de 2018 19:02:59
 * @version 1.0
 */

public class CastingPromocaoExercicio{

	public static void main( String[ ] args ) {
		double valor1 = 1;
		double valor2 = 2;
		double valor3 = 3;
		double valor4 = 4;
		double valor5 = 5;
		double valor6 = 6;
		double valor7 = 7;
		double valor8 = 8;
		double soma = valor1 + valor2 + valor3 + valor4 + valor5 + valor6 + valor7 + valor8;

		System.out.println( "Média normal :" + soma / 8 );
		System.out.println( "Média somente com inteiro: " + (int) ( soma / 8 ) );

	}

}
