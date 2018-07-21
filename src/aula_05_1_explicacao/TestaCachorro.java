package aula_05_1_explicacao;

/**
 * 
 * Classe que representa
 *
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 19 de jul de 2018 21:50:13
 * @version 1.0
 */

public class TestaCachorro{

	public static void main( String[ ] args ) {

		// Declarando uma variavel de instancia do tipo cachorro
		Cachorro dog;

		// Instanciando a Classe Cachorro
		// e atribuindo na variavel dog
		dog = new Cachorro();

		// Preenchendo os atributos do Cachorro (dog)
		dog.cor = "Amarelo";
		dog.nome = "Doguinho";
		dog.peso = 5.0f;
		dog.raca = "Vira Lata";

		// Invocando o Método do cachorro
		dog.latir();

		// Exibir os dados do Cachorro
		System.out.println( "Nome: " + dog.nome );
		System.out.println( "Cor: " + dog.cor );
		System.out.println( "Peso: " + dog.peso );
		System.out.println( "Raça: " + dog.raca );

	}

}
