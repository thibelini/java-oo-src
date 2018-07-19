package aula_04_0_exercicio_relembrando;

/**
 * Criar uma classe executável chamada CalculosAleatorios que efetuará os seguintes passos:
 * Pegar o valor inteiro da multiplicação entre dois float e armazenar numa variável;
 * Dividir o valor obtido por 2.0 e armazenar numa variável;
 * Somar os valores das duas variáveis criadas, dividir por 4 e armazenar numa variável;
 * Por fim exibir o valor da ultima variável no console padrão.
 * 
 * Classe que representa
 *
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 18 de jul de 2018 19:31:43
 * @version 1.0
 */

public class CalculosAleatorios{

	public static void main( String[ ] args ) {

		int variavel1 = (int) ( 2.5f * 12.0f );
		//System.out.println( "resultado1: " + variavel1 );

		double variavel2 = variavel1 / 2.0;
		//System.out.println( "resultado2: " + variavel2 );

		double variavel3 = ( variavel1 + variavel2 ) / 4;
		System.out.println( "O Valor é: " + variavel3 );

	}

}
