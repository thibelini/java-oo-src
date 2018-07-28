package aula_08_5_praticando;

public class TestaHeranca{

	public static void main( String[ ] args ) {

		System.out.println( "=========== Cliente ===========" );
		Cliente cliente = new Cliente( "Thiago Belini" );
		cliente.setCpf( "042.041.334-01" );
		cliente.setPercentualDesconto( Float.valueOf( "10.5" ) );
		System.out.println( cliente.getDados() );

		System.out.println( "========= Balconista ==========" );
		Balconista balconista = new Balconista( "Maria da Silva" );
		balconista.setCpf( "111.111.111-00" );
		balconista.setMatricula( "12345" );
		balconista.setPercentualSalarial( Float.valueOf( "15.0" ) );
		balconista.setSetor( "Caixa" );
		System.out.println( balconista.getDados() );

		System.out.println( "=========== Gerente ===========" );
		Gerente gerente = new Gerente( "Graziela Varella" );
		gerente.setCpf( "222.222.222-09" );
		gerente.setDepartamento( "Vendas" );
		gerente.setMatricula( "38475745839" );
		gerente.setPercentualSalarial( Float.valueOf( "30" ) );
		System.out.println( gerente.getDados() );
	}

}
