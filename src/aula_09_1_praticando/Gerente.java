package aula_09_1_praticando;

public class Gerente extends Funcionario{

	public Gerente( String nome ){
		super( nome );
	}

	@Override
	public void atender() {
		System.out.println( "Funcionário: " + getNome() + " do Cargo Gerente | " + getNome() + ", boa tarde" );
	}

}
