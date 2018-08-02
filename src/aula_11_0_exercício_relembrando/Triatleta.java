package aula_11_0_exercício_relembrando;

import java.math.BigDecimal;

public class Triatleta extends Pessoa implements Corrida, Natacao, Ciclismo{

	private BigDecimal peso;
	private String nomeCompeticao;

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso( BigDecimal peso ) {
		this.peso = peso;
	}

	public String getNomeCompeticao() {
		return nomeCompeticao;
	}

	public void setNomeCompeticao( String nomeCompeticao ) {
		this.nomeCompeticao = nomeCompeticao;
	}

	@Override
	public void aquecer() {
		System.out.println( "Aquecendo..." );
	}

	@Override
	public void alongar() {
		System.out.println( "Alongando..." );
	}

	@Override
	public void correr() {
		System.out.println( "Correndo..." );
	}

	@Override
	public void pedalar() {
		System.out.println( "Pedalando..." );
	}

	@Override
	public void nadar() {
		System.out.println( "Nadando..." );
	}

}
