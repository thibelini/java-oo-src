package aula_08_6_praticando;

public class Funcionario extends Pessoa{

	private String matricula;
	private Float percentualSalarial;

	public Funcionario( String nome, String matricula ){
		super( nome );
		setMatricula( matricula );
		System.out.println( "Funcionario" );
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula( String matricula ) {
		this.matricula = matricula;
	}

	public Float getPercentualSalarial() {
		return percentualSalarial;
	}

	public void setPercentualSalarial( Float percentualSalarial ) {
		this.percentualSalarial = percentualSalarial;
	}

}
