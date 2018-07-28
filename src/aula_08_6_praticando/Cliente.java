package aula_08_6_praticando;

public class Cliente extends Pessoa{

	private Float percentualDesconto;

	public Cliente( String nome, Float percentualDesconto ){
		super( nome );
		setPercentualDesconto( percentualDesconto );
		System.out.println( "Cliente" );
	}

	public Float getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto( Float percentualDesconto ) {
		this.percentualDesconto = percentualDesconto;
	}

	public String getDados() {
		StringBuilder texto = new StringBuilder();
		texto.append( "Nome: " );
		texto.append( getNome() );
		texto.append( " | CPF: " );
		texto.append( getCpf() );
		texto.append( " | Desconto: " );
		texto.append( getPercentualDesconto() );
		return texto.toString();
	}

}
