package aula_08_0_exercicio_relembrando;

import java.math.BigDecimal;

public class Cliente{
	private String nome;
	private String cpf;
	private ContaBancaria contaBancaria;

	public Cliente(){
		setContaBancaria( new ContaBancaria() );
	}

	public Cliente( BigDecimal saldoInicial ){
		setContaBancaria( new ContaBancaria( saldoInicial ) );
	}

	public String getNome() {
		return nome;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf( String cpf ) {
		this.cpf = cpf;
	}

	public ContaBancaria getContaBancaria() {
		return contaBancaria;
	}

	public void setContaBancaria( ContaBancaria contaBancaria ) {
		this.contaBancaria = contaBancaria;
	}

}
