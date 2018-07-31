package aula_10_0_exercicio_relembrando;

public class Fruta{

	private String nome;
	private String sabor;
	private boolean possuiSemente;

	public String getNome() {
		return nome;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor( String sabor ) {
		this.sabor = sabor;
	}

	public boolean isPossuiSemente() {
		return possuiSemente;
	}

	public void setPossuiSemente( boolean possuiSemente ) {
		this.possuiSemente = possuiSemente;
	}

	public void extrairSuco() {
		System.out.println( "Extraindo Suco!" );
	}

}
