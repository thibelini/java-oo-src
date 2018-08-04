package aula_13_3_exemplificando;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class TestaThrows{

	public static void main( String[ ] args ) {

		try {
			testarTryCatch( "/Users/thibelini/teste.txt", "15R" );
			JOptionPane.showMessageDialog( null, "... Continuando o Fluxo" );
		} catch ( FileNotFoundException e ) {
			e.printStackTrace();
			JOptionPane.showMessageDialog( null, e.getMessage() );
		} catch ( NumberFormatException e ) {
			e.printStackTrace();
			JOptionPane.showMessageDialog( null, e.getMessage() );
		}
	}

	private static void testarTryCatch( String arquivo, String numero ) throws FileNotFoundException {

		/** Exemplo de Exception Checada */
		FileReader leitor = new FileReader( arquivo );

		try {
			/** Exemplo de Não Checada */
			Double valor = Double.valueOf( numero );
			System.out.println( valor.toString() );
		} catch ( NumberFormatException e ) {
			String valorInvalido = e.getMessage().split( ":" )[ 1 ].replaceAll( "\"", "" ).trim();
			throw new NumberFormatException( "Por favor, informe apenas números! " + valorInvalido + " é inválido" );
		}
	}

}
