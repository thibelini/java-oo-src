package aula_04_5_praticando;

import javax.swing.JOptionPane;

/**
 * Classe responsável por calcular o quadrado de " i ", de 0 a 10, e exibi-lo no console padrão.
 * 
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 18 de jul de 2018 21:57:43
 * @version 1.0
 */

public class LacoRepeticao{

	public static void main( String[ ] args ) {

		System.out.println( "Usando o FOR" );
		for ( int i = 1; i <= 10; i++ ) {
			System.out.println( "O Quadrado de " + i + " é " + ( i * i ) );
		}

		System.out.println( "Usando o WHILE" );
		int w = 0;
		while ( w <= 10 ) {
			System.out.println( "O Quadrado de " + w + " é " + ( w * w ) );
			w++;
		}

		int dw = 0;
		System.out.println( "DO WHILE" );
		do {
			System.out.println( "O Quadrado de " + dw + " é " + ( dw * dw ) );
			dw++;
		} while ( dw <= 10 );

		/**
		 * Nomeando o FOR.
		 * Quando definimos uma LABEL para o FOR estamos nomeando-o.
		 * Nomeamos um FOR com o intuito de poder sair dele a qualquer
		 * momento.
		 */

		forMagico: for ( ;; ) {
			String numero = JOptionPane.showInputDialog( "Adivinhe o Numero" );

			switch ( numero ) {
				case "5":
					JOptionPane.showMessageDialog( null, "Parabens, voce ganhou" );
					break forMagico;
				default:
					JOptionPane.showMessageDialog( null, "Quase acertou!" );
					break;
			}
		}

		JOptionPane.showMessageDialog( null, "Fim do Jogo!" );
	}
}
