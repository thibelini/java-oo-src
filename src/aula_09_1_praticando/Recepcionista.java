package aula_09_1_praticando;

public class Recepcionista extends Funcionario{

	public Recepcionista( String nome ){
		super( nome );
	}

	@Override
	public void atender() {
		System.out.println( "Funcionário: " + getNome() + " do cargo Recepcionista | SRC, " + getNome() + " boa tarde!" );
	}

}
