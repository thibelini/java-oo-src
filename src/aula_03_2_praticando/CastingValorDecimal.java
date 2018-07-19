package aula_03_2_praticando;

/**
 * Descrição
 * Criar uma classe com qualquer nome que exiba o valor decimal do IMC de uma pessoa.
 * Dica: IMC = peso / (altura*altura)
 * 
 * Classe que representa
 *
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 18 de jul de 2018 19:09:03
 * @version 1.0
 */

public class CastingValorDecimal{

	public static void main( String[ ] args ) {
		double peso = 95;
		double altura = 1.83;
		double imc = peso / ( altura * altura );
		int parteInteria = (int) imc;

		System.out.println( "IMC original: " + imc );
		System.out.println( "IMC decimal: " + ( imc - parteInteria ) );

	}

}
