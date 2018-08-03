package aula_13_2_exemplificando;

import javax.swing.JOptionPane;

public class TestaFinally{

	public static void main( String[ ] args ) {
		System.out.println( getTextoFinally( null ) );
	}

	private static String getTextoFinally( String palavra ) {
		try {
			String texto = "Usando o Finally - " + palavra.length();
			return texto;
		} catch ( Exception e ) {
			JOptionPane.showMessageDialog( null, "Erro ocorrido" );
		} finally {
			JOptionPane.showMessageDialog( null, "Obrigado por usar esse Metodo" );
		}
		return null;
	}

}
