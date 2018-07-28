package aula_08_5_praticando;

public class Balconista extends Funcionario{

	private String setor;

	public String getSetor() {
		return setor;
	}

	public void setSetor( String setor ) {
		this.setor = setor;
	}

	public Balconista( String nome ){
		super( nome );
		System.out.println( "Balconista" );
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
		texto.append( " | Setor: " );
		texto.append( getSetor() );
		return texto.toString();
	}

}
