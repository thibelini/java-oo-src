package aula_08_0_exercicio_relembrando;

import java.math.BigDecimal;

public class CaixaEletronico{
	private Boolean emUso;

	public void sacar( Cliente cliente, BigDecimal valor ) {
		BigDecimal saldoAtual = cliente.getContaBancaria().getSaldo();
		cliente.getContaBancaria().setSaldo( saldoAtual.subtract( valor ) );
		cliente.getContaBancaria().addTransacao( "Saque", valor );
	}

	public void depositar( Cliente cliente, BigDecimal valor ) {
		BigDecimal saldoAtual = cliente.getContaBancaria().getSaldo();
		cliente.getContaBancaria().setSaldo( saldoAtual.add( valor ) );
		cliente.getContaBancaria().addTransacao( "Depósito", valor );
	}

	public void exibirSaldo( Cliente cliente ) {
		System.out.println( "Saldo da Conta ==> " + cliente.getContaBancaria().getSaldo() + "\n" );
	}

	public void exibirExtrato( Cliente cliente ) {
		System.out.println( "======= Extrato =========" );
		System.out.println( cliente.getContaBancaria().getTransacao() );
	}
}
