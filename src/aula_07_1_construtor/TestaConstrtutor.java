package aula_07_1_construtor;

/**
 * 
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 25 de jul de 2018 19:43:12
 * @version 1.0
 */

public class TestaConstrtutor{

	public static void main( String[ ] args ) {

		/** Demonstrando o Construtor Padrao */
		Categoria categoria = new Categoria();

		System.out.println( categoria.getNome() );

		/** Demonstrando o Construtor Customizado */
		Categoria categoria2 = new Categoria( "Teste" );

		System.out.println( categoria2.getNome() );

	}

}
