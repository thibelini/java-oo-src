package aula_09_4_praticando;

public class TestaPolimorfismo3{

	public static void main( String[ ] args ) {

		Caixa caixa = new Caixa();
		caixa.setNome( "Thiago Caixa" );

		Balconista balconista = new Balconista();
		balconista.setNome( "Graziela Balcanista" );

		saldar( caixa );
		saldar( balconista );

	}

	private static void saldar( Funcionario funcionario ) {
		if ( funcionario instanceof Caixa ) {
			System.out.println( "Bom dia Caixa" );
		} else if ( funcionario instanceof Balconista ) {
			System.out.println( "Bom dia Balconista" );
		}
	}

}
