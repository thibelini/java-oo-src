package aula_08_3_praticando;

import java.math.BigDecimal;

public class Utilidades{

	public static BigDecimal multiplicar( BigDecimal valor1, BigDecimal valor2 ) {
		return valor1.multiply( valor2 );
	}

	public static BigDecimal somar( BigDecimal valor1, BigDecimal valor2 ) {
		return valor1.add( valor2 );
	}

}
