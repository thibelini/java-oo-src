package aula_05_6_praticando;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestaMetodos{

	public static void main( String[ ] args ) {

		Venda venda = new Venda();
		venda.codigo = 5;
		venda.data = LocalDateTime.now();
		venda.total = new BigDecimal( "500.00" );

		VendaMetodo vendaMetodo = new VendaMetodo();
		vendaMetodo.exibirTotal( venda.total );
		Integer novoCodigoVenda = vendaMetodo.retornarCodigoNovo( venda.codigo );
		System.out.println( "O proximo novo código da venda será: " + novoCodigoVenda );

		System.out.println( "===========================================" );

		Cliente cliente = new Cliente();
		cliente.codigo = 10;
		cliente.dataCadastro = LocalDateTime.now();
		cliente.nome = "Thiago Belini";

		LocalDateTime dataCadastro = cliente.retornarDataCadastro( cliente );
		System.out.println( "A Data de Cadastro do cliente é: " + dataCadastro );

		cliente.exibirDados();

	}

}
