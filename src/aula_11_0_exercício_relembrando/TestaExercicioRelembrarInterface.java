package aula_11_0_exercício_relembrando;

import java.math.BigDecimal;

public class TestaExercicioRelembrarInterface{

	public static void main( String[ ] args ) {

		Triatleta triatleta = new Triatleta();
		triatleta.setNome( "Thiago" );
		triatleta.setDataNascimento( "03/04/1981" );
		triatleta.setPeso( new BigDecimal( "91.5" ) );
		triatleta.setNomeCompeticao( "Triatlon" );
		System.out.println( "Atleta Completo: " + triatleta.getNome() );
		triatleta.aquecer();
		triatleta.alongar();
		triatleta.correr();
		triatleta.pedalar();
		triatleta.nadar();

		System.out.println( System.lineSeparator() );
		System.out.println( "Atleta Corredor" );
		Corrida corrida = triatleta;
		corrida.aquecer();
		corrida.alongar();
		corrida.correr();

		System.out.println( System.lineSeparator() );
		System.out.println( "Atleta Nadador" );
		Natacao natacao = triatleta;
		natacao.aquecer();
		natacao.alongar();
		natacao.nadar();

		System.out.println( System.lineSeparator() );
		System.out.println( "Atleta Cliclista" );
		Ciclismo ciclismo = triatleta;
		ciclismo.aquecer();
		ciclismo.alongar();
		ciclismo.pedalar();

	}
}
