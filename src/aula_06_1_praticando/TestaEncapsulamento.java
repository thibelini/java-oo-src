package aula_06_1_praticando;

import java.math.BigDecimal;

/**
 *
 * Na classe TestaExercicio criar 3 objetos de cada tipo, preenche-los e exibir seus dados no console.
 * 
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 23 de jul de 2018 20:27:22
 * @version 1.0
 */

public class TestaEncapsulamento{

	public static void criarEmostrarPlaneta( String nome, BigDecimal diametro, BigDecimal peso ) {
		Planeta planeta = new Planeta();
		planeta.setNome( nome );
		planeta.setDiametro( diametro );
		planeta.setPeso( peso );
		System.out.println( planeta.getDados() );
	}

	public static void criarEmostrarProduto( Integer codigo, String nome, BigDecimal preco ) {
		Produto produto = new Produto();
		produto.setCodigo( codigo );
		produto.setNome( nome );
		produto.setPreco( preco );
		System.out.println( produto.getDados() );
	}

	public static void criarEmostrarBalconista( String nome, String sexo, String cidade ) {
		Balconista balconista = new Balconista();
		balconista.setNome( nome );
		balconista.setSexo( sexo );
		balconista.setCidade( cidade );
		System.out.println( balconista.getDados() );
	}

	public static void main( String[ ] args ) {
		/* Testando o Planeta */
		System.out.println( "======== Planetas =====================" );
		criarEmostrarPlaneta( "Saturno", new BigDecimal( "100000000.5" ), new BigDecimal( "150000000000000000.89" ) );
		criarEmostrarPlaneta( "Terra", new BigDecimal( "97878.3" ), new BigDecimal( "9087000.89" ) );
		criarEmostrarPlaneta( "Mercúrio", new BigDecimal( "1233.99" ), new BigDecimal( "33344521.9" ) );

		/* Testando o Produtos */
		System.out.println( "======== Produtos =====================" );
		criarEmostrarProduto( new Integer( "1" ), "Tenis Azul", new BigDecimal( "300.89" ) );
		criarEmostrarProduto( new Integer( "2" ), "Bone Preto", new BigDecimal( "70.20" ) );
		criarEmostrarProduto( new Integer( "3" ), "Celular Motorola", new BigDecimal( "1400.89" ) );

		/* Testando o Balconista */
		System.out.println( "======== Balconista ===================" );
		criarEmostrarBalconista( "Graziela Varela", "Feminino", "Assis" );
		criarEmostrarBalconista( "Juliana Belini", "Feminino", "Assis" );
		criarEmostrarBalconista( "Thiago Belini", "Masculino", "São Paulo" );

	}

}
