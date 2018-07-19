package aula_02_1_praticando;

/**
 * 
 * Classe que representa
 *
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 17 de jul de 2018 22:12:47
 * @version 1.0
 * 
 *          Descriçao
 *          Cria uma Classe chamada Exercicio3Aula2 que calcule a Velocidade média em km/h de um veiculo que percorreu 20.000 metros em 1.200 segundos.
 *          Exibir no console o seguinte texto: Velocidade média foi de xxxx km/h
 *          Utilizem quantas VARIAVEIS quiser.
 * 
 */

public class Exercicio3Aula2{

	public static void main( String[ ] args ) {
		double distancia = 20000;
		double tempo = 1200;
		double velocidade = ( distancia / tempo ) * 3.6;

		System.out.println( "Velocidade média foi de " + velocidade + " km/h" );

	}

}
