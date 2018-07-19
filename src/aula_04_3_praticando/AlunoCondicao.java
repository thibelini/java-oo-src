package aula_04_3_praticando;

import javax.swing.JOptionPane;

/**
 * Criar uma classe que calcule a media entre 4 notas e exiba a situação do aluno.
 * Aplique as seguintes regras:
 * media >= 7.0 - Aprovado
 * media < 7.0 e media >= 4 - Exame
 * media < 4.0 e media >= 0 - Reprovado
 *
 *
 * 
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 18 de jul de 2018 21:01:28
 * @version 1.0
 */

public class AlunoCondicao{

	public static void main( String[ ] args ) {
		String nota1 = JOptionPane.showInputDialog( "Digite a Nota 1" );
		String nota2 = JOptionPane.showInputDialog( "Digite a Nota 2" );
		String nota3 = JOptionPane.showInputDialog( "Digite a Nota 3" );
		String nota4 = JOptionPane.showInputDialog( "Digite a Nota 4" );

		Double media = ( Double.valueOf( nota1 ) + Double.valueOf( nota2 ) + Double.valueOf( nota3 ) + Double.valueOf( nota4 ) ) / 4;

		if ( media >= 7 ) {
			JOptionPane.showMessageDialog( null, "Aprovado" );
		} else if ( media < 7.0 && media >= 4 ) {
			JOptionPane.showMessageDialog( null, "Exame" );
		} else if ( media < 4.0 && media >= 0 ) {
			JOptionPane.showMessageDialog( null, "Reprovado" );
		}
	}

}
