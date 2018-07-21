package aula_05_5_explicacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 
 * Classe que representa
 *
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 20 de jul de 2018 21:19:58
 * @version 1.0
 */

public class CaixaEletronico{

	BigDecimal saldo = BigDecimal.ZERO;

	void exibirSaldo() {
		System.out.println( "Saldo atual:" + saldo );
	}

	void depositar( BigDecimal valor, String agencia, String numeroConta ) {
		StringBuilder texto = new StringBuilder();
		texto.append( "Depositando o Valor: " );
		texto.append( valor );
		texto.append( " na Agencia/Conta: " );
		texto.append( agencia );
		texto.append( " / " );
		texto.append( numeroConta );
		System.out.println( texto.toString() );
		saldo = saldo.add( valor );
	}

	void sair() {
		System.out.println( "Logout em 50 Segundos!" );
	}

	Comprovante emitirComprovante( BigDecimal valor ) {
		Comprovante comprovante = new Comprovante();
		comprovante.dataHoraEmisssao = LocalDateTime.now();
		comprovante.valor = valor;
		return comprovante;
	}
}
