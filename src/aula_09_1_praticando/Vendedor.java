package aula_09_1_praticando;

public class Vendedor extends Funcionario{

	public Vendedor( String nome ){
		super( nome );
	}

	@Override
	public void atender() {
		System.out.println( "Funcionário: " + getNome() + " do Cargo Vendedor | Boa tarde, tudo bem!?" );
	}

}
