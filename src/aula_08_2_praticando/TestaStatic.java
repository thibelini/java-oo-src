package aula_08_2_praticando;

public class TestaStatic{

	public static void main( String[ ] args ) {

		Aluno.media = 7.0;

		Aluno aluno = new Aluno();
		aluno.nome = "Thiago";
		aluno.nota = 9.0;
		if ( aluno.nota >= Aluno.media ) {
			System.out.println( "O Aluno " + aluno.nome + " foi aprovado!" );
		}

		Aluno aluno1 = new Aluno();
		aluno1.nome = "Graziela";
		aluno1.nota = 7.75;
		if ( aluno1.nota >= Aluno.media ) {
			System.out.println( "O Aluno " + aluno1.nome + " foi aprovado!" );
		}

		Aluno aluno2 = new Aluno();
		aluno2.nome = "Mario";
		aluno2.nota = 10.0;
		if ( aluno2.nota >= Aluno.media ) {
			System.out.println( "O Aluno " + aluno2.nome + " foi aprovado!" );
		}

		Aluno aluno3 = new Aluno();
		aluno3.nome = "Gabriel";
		aluno3.nota = 5.0;
		if ( aluno3.nota >= Aluno.media ) {
			System.out.println( "O Aluno " + aluno3.nome + " foi aprovado!" );
		}

		Aluno aluno4 = new Aluno();
		aluno4.nome = "Zé do Chopp";
		aluno4.nota = 9.0;
		if ( aluno4.nota >= Aluno.media ) {
			System.out.println( "O Aluno " + aluno4.nome + " foi aprovado!" );
		}

		System.out.println( aluno.getDados() );
		System.out.println( aluno1.getDados() );
		System.out.println( aluno2.getDados() );
		System.out.println( aluno3.getDados() );
		System.out.println( aluno4.getDados() );

	}

}