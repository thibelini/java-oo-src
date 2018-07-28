package aula_08_6_praticando;

public class Gerente extends Funcionario{

	private String departamento;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento( String departamento ) {
		this.departamento = departamento;
	}

	public Gerente( String nome, String matricula, String departamento ){
		super( nome, matricula );
		setDepartamento( departamento );
		System.out.println( "Gerente" );
	}

	public String getDados() {
		StringBuilder texto = new StringBuilder();
		texto.append( "Nome: " );
		texto.append( getNome() );
		texto.append( " | CPF: " );
		texto.append( getCpf() );
		texto.append( " | Matricula: " );
		texto.append( getMatricula() );
		texto.append( " | Perc Salarial: " );
		texto.append( getPercentualSalarial() );
		texto.append( " | Departamento: " );
		texto.append( getDepartamento() );
		return texto.toString();
	}

}
