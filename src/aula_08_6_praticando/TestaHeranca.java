package aula_08_6_praticando;

public class TestaHeranca{

	public static void main( String[ ] args ) {

		System.out.println( "=========== Cliente ===========" );
		Cliente cliente = new Cliente( "Thiago Belini", Float.valueOf( "10.5" ) );
		cliente.setCpf( "042.041.334-01" );
		System.out.println( cliente.getDados() );

		System.out.println( "========= Balconista ==========" );
		Balconista balconista = new Balconista( "Maria da Silva", "12345", "Caixa" );
		balconista.setCpf( "111.111.111-00" );
		balconista.setPercentualSalarial( Float.valueOf( "15.0" ) );
		System.out.println( balconista.getDados() );

		System.out.println( "=========== Gerente ===========" );
		Gerente gerente = new Gerente( "Graziela Varella", "38475745839", "Vendas" );
		gerente.setCpf( "222.222.222-09" );
		gerente.setPercentualSalarial( Float.valueOf( "30" ) );
		System.out.println( gerente.getDados() );

	}

}
