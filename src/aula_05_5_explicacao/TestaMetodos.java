package aula_05_5_explicacao;

import java.math.BigDecimal;

/**
 * 
 * Classe que representa
 *
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 20 de jul de 2018 21:28:29
 * @version 1.0
 */

public class TestaMetodos{

	public static void main( String[ ] args ) {

		BigDecimal valorDepositar = new BigDecimal( "5000.55" );

		/* Instanciando a classe Aula05Explicacao5  */
		CaixaEletronico caixaEletronico = new CaixaEletronico();

		/* Invocando os metodos da classe por meio do objeto */
		caixaEletronico.depositar( valorDepositar, "0143", "31327-8" );

		Comprovante comprovanteDeposito = caixaEletronico.emitirComprovante( valorDepositar );
		System.out.println( comprovanteDeposito.dataHoraEmisssao );
		System.out.println( comprovanteDeposito.valor );

		caixaEletronico.exibirSaldo();
		caixaEletronico.sair();

	}

}
