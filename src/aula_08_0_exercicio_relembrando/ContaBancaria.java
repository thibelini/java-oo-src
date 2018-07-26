package aula_08_0_exercicio_relembrando;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContaBancaria{

	private BigDecimal saldo;
	private String transacao;

	public ContaBancaria(){
		setSaldo( new BigDecimal( "0" ) );
		setTransacao( "" );
	}

	public ContaBancaria( BigDecimal saldoInicial ){
		setSaldo( saldoInicial );
		setTransacao( "" );
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo( BigDecimal saldo ) {
		this.saldo = saldo;
	}

	public String getTransacao() {
		return transacao;
	}

	public void setTransacao( String transacao ) {
		this.transacao = transacao;
	}

	public void addTransacao( String acao, BigDecimal valor ) {
		StringBuilder texto = new StringBuilder();
		texto.append( getTransacao() );
		texto.append( LocalDateTime.now().format( DateTimeFormatter.ofPattern( "dd/MM/yyyy HH:mm:ss" ) ) );
		texto.append( " => " );
		texto.append( acao );
		texto.append( " de " );
		texto.append( String.format( "%,.2f", valor ) );
		texto.append( "\n" );
		setTransacao( texto.toString() );
	}
}
