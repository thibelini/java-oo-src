package aula_04_3_praticando;

import javax.swing.JOptionPane;

/**
 * Criar uma classe que verifique se o aluno é Criança, Adolescente, Adulto ou Idoso de acordo com a idade informada pelo usuário.
 * Situações:
 * Criança – de 0 a 14 anos;
 * Adolescente: de 15 a 18 anos;
 * Adulto: de 19 a 60;
 * Idoso: de 61 pra frente.
 * 
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 18 de jul de 2018 21:10:33
 * @version 1.0
 */

public class AlunoIdade{

	public static void main( String[ ] args ) {

		String idade = JOptionPane.showInputDialog( "Digite a Idade do Aluno" );

		if ( Integer.valueOf( idade ) <= 0 && Integer.valueOf( idade ) <= 14 ) {
			JOptionPane.showMessageDialog( null, "O Aluno é Criança: de 0 a 14 anos" );
		} else if ( Integer.valueOf( idade ) >= 15 && Integer.valueOf( idade ) <= 18 ) {
			JOptionPane.showMessageDialog( null, "O Aluno é Adolescente: de 15 a 18 anos" );
		} else if ( Integer.valueOf( idade ) >= 19 && Integer.valueOf( idade ) <= 60 ) {
			JOptionPane.showMessageDialog( null, "O Aluno é Adulto: de 19 a 60" );
		} else {
			JOptionPane.showMessageDialog( null, "O Aluno é Idoso: de 61 pra frente" );
		}
	}

}
