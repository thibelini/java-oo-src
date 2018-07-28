package aula_08_5_praticando;

public class Gerente extends Funcionario{

	private String departamento;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento( String departamento ) {
		this.departamento = departamento;
	}

	public Gerente( String nome ){
		super( nome );
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
