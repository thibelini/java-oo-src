package aula_06_1_praticando;

import java.math.BigDecimal;

/**
 * 
 *
 * Criar 3 classes chamadas respectivamente Planeta, Produto, Balconista seguindo os seguintes conceitos:
 * Modificador de acesso
 * Encapsulamento
 * Sombreamento
 * Estas classes conterão 3 atributos da sua escolha.
 * Dica: Crie todos os atributos privates e crie um método get e um set para cada um alem do getDados().
 * 
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 23 de jul de 2018 20:08:36
 * @version 1.0
 */

public class Planeta{

	/* atributos */
	private String nome;
	private BigDecimal diametro;
	private BigDecimal peso;

	/* Métodos do Encapsulamento (get e set)*/
	/* Métodos Get - Retornos */
	public String getNome() {
		return nome;
	}

	/* Métodos Set - Não retornoam e possuem argumento */
	public void setNome( String nome ) {
		/* aplicando o sombreamento */
		this.nome = nome;
	}

	public BigDecimal getDiametro() {
		return diametro;
	}

	public void setDiametro( BigDecimal diametro ) {
		this.diametro = diametro;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso( BigDecimal peso ) {
		this.peso = peso;
	}

	public String getDados() {
		StringBuilder texto = new StringBuilder();
		texto.append( "Nome: " );
		texto.append( nome );
		texto.append( " - Diametro: " );
		texto.append( diametro );
		texto.append( " Metros" );
		texto.append( " - Peso: " );
		texto.append( peso );
		texto.append( " Kilos" );
		return texto.toString();
	}
}
