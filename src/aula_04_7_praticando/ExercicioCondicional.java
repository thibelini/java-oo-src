package aula_04_7_praticando;

/**
 * Criar uma classe que exiba duas cadeias numéricas das quais, uma
 * em ordem crescente de 0 a 100 e a outra em ondem decrescente de 100 a 0
 * 
 * Exemplo
 * 0 -100
 * 1 - 99
 * 2 - 98
 * 
 * PS: Utilize o For e uma variável auxiliar para isso.
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 19 de jul de 2018 18:55:54
 * @version 1.0
 * 
 */

public class ExercicioCondicional{

	public static void main( String[ ] args ) {
		int j = 100;
		for ( int i = 0; i <= 100; i++ ) {
			System.out.println( i + " - " + j-- );
		}

	}

}
