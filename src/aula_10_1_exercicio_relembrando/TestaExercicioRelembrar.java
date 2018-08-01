package aula_10_1_exercicio_relembrando;

public class TestaExercicioRelembrar{

	public static void main( String[ ] args ) {

		Suco suco = new Suco( new Laranja(), "Laranja Lima" );
		suco.getFruta().setSabor( "Azedo" );
		suco.getFruta().setPossuiSemente( true );
		suco.setQuantidade( 200 );
		suco.setUnidadeMedida( "Duzia" );
		suco.exibirDescricao();
		suco.getFruta().extrairSuco();

		Fruta frutaIndefinida = suco.getFruta();
		if ( frutaIndefinida instanceof Laranja ) {

			Laranja laranjaSuco = (Laranja) frutaIndefinida;
			System.out.println( frutaIndefinida.getNome() + " - " + frutaIndefinida.getSabor() );

		} else if ( frutaIndefinida instanceof Limao ) {

			Limao limaoSuco = (Limao) frutaIndefinida;
			System.out.println( limaoSuco.getNome() + " - " + limaoSuco.getSabor() );

		} else if ( frutaIndefinida instanceof Acerola ) {

			Acerola acerolaSuco = (Acerola) frutaIndefinida;
			System.out.println( acerolaSuco.getNome() + " - " + acerolaSuco.getSabor() );

		}

		/** Utilizando a Generalizacao para uma chamada polimorfica */
		System.out.println( frutaIndefinida.getNome() + " - " + frutaIndefinida.getSabor() );
		frutaIndefinida.extrairSuco();

		//Fruta fruta = new Limao();
		//fruta.extrairSuco();
	}

}
