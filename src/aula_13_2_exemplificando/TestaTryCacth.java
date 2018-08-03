package aula_13_2_exemplificando;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class TestaTryCacth{

	public static void main( String[ ] args ) {

		testarTryCatch( "/Users/thibelini/teste.txt" );
		JOptionPane.showMessageDialog( null, "... Continuando o Fluxo" );

	}

	private static void testarTryCatch( String arquivo ) {
		try {
			/** Exemplo de Exception Checada */
			FileReader leitor = new FileReader( arquivo );

			/** Exemplo de Não Checada */
			Double valor = null;
			System.out.println( valor.toString() );

		} catch ( FileNotFoundException e ) {
			e.printStackTrace();
			System.err.println( "Erro Tratado: FileNotFoundException - Por favor verifique a existencia do arquivo [" + arquivo + "]" );
		} catch ( NullPointerException e ) {
			e.printStackTrace();
			System.err.println( "Erro Tratado: NullPointerException" );
		}
	}

}
