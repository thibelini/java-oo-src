package aula_08_0_exercicio_relembrando;

import java.math.BigDecimal;

/**
 * Criar 1 Cliente
 * Faça com cada um:
 * Três depósitos;
 * Exiba o saldo;
 * Dois Saques;
 * Um Deposito;
 * Exiba o Saldo;
 * 
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 25 de jul de 2018 20:51:38
 * @version 1.0
 */

public class TestaCaixaEletronico{

	public static void main( String[ ] args ) {

		CaixaEletronico caixa = new CaixaEletronico();
		Cliente cliente1 = new Cliente( new BigDecimal( "200" ) );
		cliente1.setNome( "Thiago Belini" );
		cliente1.setCpf( "042.041.334-01" );

		StringBuilder texto = new StringBuilder();
		texto.append( "======= Dados Cliente =========" );
		texto.append( "\nCliente: " );
		texto.append( cliente1.getNome() );
		texto.append( "\nCPF: " );
		texto.append( cliente1.getCpf() );
		System.out.println( texto.toString() + "\n" );

		caixa.exibirSaldo( cliente1 );
		caixa.depositar( cliente1, new BigDecimal( "100" ) );
		caixa.depositar( cliente1, new BigDecimal( "500" ) );
		caixa.depositar( cliente1, new BigDecimal( "1000" ) );
		caixa.exibirExtrato( cliente1 );
		caixa.exibirSaldo( cliente1 );
		caixa.sacar( cliente1, new BigDecimal( "300" ) );
		caixa.sacar( cliente1, new BigDecimal( "500" ) );
		caixa.depositar( cliente1, new BigDecimal( "10" ) );
		caixa.exibirExtrato( cliente1 );
		caixa.exibirSaldo( cliente1 );

		//String.valueOf( new Object() )

	}

}
