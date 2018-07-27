package aula_08_3_praticando;

import java.math.BigDecimal;

public class TestaUtilidades{

	public static void main( String[ ] args ) {
		System.out.println( Utilidades.somar( new BigDecimal( "2" ), new BigDecimal( "6" ) ) );
		System.out.println( Utilidades.multiplicar( new BigDecimal( "2" ), new BigDecimal( "6" ) ) );
	}

}
