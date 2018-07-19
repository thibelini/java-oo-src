package aula_04_1_praticando;

import javax.swing.JOptionPane;

/**
 * Exemplificação de Condicional com interação com usuário.
 * Classe responsável por somar dois números e informar no console se o resultado é impar ou par.
 * Para o correto funcionamento o usuário deverá informar 2 números inteiros.
 * 
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 18 de jul de 2018 20:37:48
 * @version 1.0
 */

public class Condicional{

	public static void main( String[ ] args ) {

		/* solicitando os dados ao usuario */
		String valor1String = JOptionPane.showInputDialog( "Primeiro Valor" );
		String valor2String = JOptionPane.showInputDialog( "Segundo Valor" );
		/** Convertendo as strings em numericos **/
		Integer valor1 = Integer.valueOf( valor1String );
		Integer valor2 = Integer.valueOf( valor2String );

		/** efetuando calculo **/
		Integer soma = valor1 + valor2;

		/** Realizando a comparacao utilizando IP **/
		if ( soma % 2 == 0 ) {
			JOptionPane.showMessageDialog( null, "O Numero " + soma + " é PAR " );
		} else {
			JOptionPane.showMessageDialog( null, "O Numero " + soma + " é IMPAR " );
		}

	}

}
