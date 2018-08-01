package aula_10_1_exercicio_relembrando;

public final class Suco{

	private int quantidade;
	private String unidadeMedida;
	private Fruta fruta;

	public Suco( Fruta fruta, String nome ){
		setFruta( fruta );
		getFruta().setNome( nome );

	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade( int quantidade ) {
		this.quantidade = quantidade;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida( String unidadeMedida ) {
		this.unidadeMedida = unidadeMedida;
	}

	public Fruta getFruta() {
		return fruta;
	}

	public void setFruta( Fruta fruta ) {
		this.fruta = fruta;
	}

	public void exibirDescricao() {
		StringBuilder texto = new StringBuilder();
		texto.append( "Fruta: " );
		texto.append( getFruta().getNome() );
		texto.append( " | Sabor: " );
		texto.append( getFruta().getSabor() );
		texto.append( getFruta().isPossuiSemente() ? " | Possui Semente" : " | Não Possui Semente" );
		texto.append( " | Quantidade: " );
		texto.append( getQuantidade() + " ML" );
		texto.append( " | Unidade: " );
		texto.append( getUnidadeMedida() );
		System.out.println( texto.toString() );
	}

}
