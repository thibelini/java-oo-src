package aula_08_1_praticando;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 26 de jul de 2018 19:34:40
 * @version 1.0
 */

public class TestaExercicio{

	public static void main( String[ ] args ) {

		Venda venda = new Venda();
		venda.setId( Long.valueOf( "10" ) );
		venda.setData( LocalDateTime.now() );
		venda.setTotal( new BigDecimal( "100.00" ) );
		venda.setNumeroNota( "123456" );
		venda.getCliente().setId( Long.valueOf( "1" ) );
		venda.getCliente().setNome( "Thiago Belini" );
		venda.getCliente().setCpf( "042.041.334.01" );
		venda.getCliente().setCidade( "Assis" );
		venda.getCliente().setUf( "SP" );
		System.out.println( venda.getDados() );

	}

}
