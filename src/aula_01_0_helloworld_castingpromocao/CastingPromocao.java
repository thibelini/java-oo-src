package aula_01_0_helloworld_castingpromocao;

public class CastingPromocao{

	public static void main( String[ ] args ) {
		float meuFloat = 150.8f;
		int meuInt = 15;
		float testePromocaa = meuInt;

		System.out.println( testePromocaa );

		int testeCasting = (int) meuFloat;

		System.out.println( testeCasting );
		System.out.println( (float) testeCasting );
		System.out.println( ( 5.0 / 2 ) );

	}

}
