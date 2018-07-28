package aula_08_7_praticando;

public class TestaReescrita{

	public static void main( String[ ] args ) {

		Gerente gerente = new Gerente();
		gerente.setSalario( Double.valueOf( "1000.00" ) );
		System.out.println( gerente.getSalario() );
	}

}
