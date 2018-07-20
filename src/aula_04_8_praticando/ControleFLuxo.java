package aula_04_8_praticando;

public class ControleFLuxo{

	public static void main( String[ ] args ) {
		/**
		 * Responsáveis por interromper ou continuar o fluxo de um Laço de repetição.
		 * A ideia aqui é encontrar e exibir todos os numeros pares no intervalo.
		 * 
		 */
		System.out.println( "====== NORMAL ( NOOB MODE )======" );
		for ( int i = 1; i <= 6; i++ ) {
			if ( i % 2 == 0 ) {
				System.out.println( "Par encontrado " + i );
			} else {
				System.out.println( i + " não é Par " );
			}
		}

		/**
		 * O comando break faz sair do escopo do for do qual foi executado;
		 * A ideia aqui é encontrar e exibir o 1º numero par no intervalo.
		 * 
		 */
		System.out.println( "====== BREAK  ======" );
		for ( int i = 1; i <= 6; i++ ) {
			if ( i % 2 == 0 ) {
				System.out.println( "Par encontrado " + i );
				break;
			}
			System.out.println( i + " não é Par " );
		}

		/**
		 * O comando continue faz o fluxo do laço interromper e começar novamente, porém com o valor do próximo índice;
		 * Ele para o processo, incrementa a variável controladora, valida a condição de existência do laço e executa caso seja permitido.
		 * A ideia aqui é encontrar e exibir todos os numeros pares no intervalo.
		 * 
		 */
		System.out.println( "====== CONINUE======" );
		for ( int i = 1; i <= 6; i++ ) {
			if ( i % 2 == 0 ) {
				System.out.println( "Par encontrado " + i );
				continue;
			}
			System.out.println( i + " não é Par " );
		}

	}

}
