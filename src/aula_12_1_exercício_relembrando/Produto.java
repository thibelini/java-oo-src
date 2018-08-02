package aula_12_1_exercício_relembrando;

public class Produto implements Comparable< Produto >{

	private long codigo;
	private String nome;
	private double preco;
	private String unidadeMedida;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo( long codigo ) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco( double preco ) {
		this.preco = preco;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida( String unidadeMedida ) {
		this.unidadeMedida = unidadeMedida;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) ( codigo ^ ( codigo >>> 32 ) );
		return result;
	}

	@Override
	public boolean equals( Object obj ) {
		if ( this == obj ) {
			return true;
		}
		if ( obj == null ) {
			return false;
		}
		if ( !( obj instanceof Produto ) ) {
			return false;
		}
		Produto other = (Produto) obj;
		if ( codigo != other.codigo ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append( "Produto [\n\tcodigo=" );
		builder.append( codigo );
		builder.append( ", \n\t" );
		if ( nome != null ) {
			builder.append( "nome=" );
			builder.append( nome );
			builder.append( ", \n\t" );
		}
		builder.append( "preco=" );
		builder.append( preco );
		builder.append( ", \n\t" );
		if ( unidadeMedida != null ) {
			builder.append( "unidadeMedida=" );
			builder.append( unidadeMedida );
		}
		builder.append( "]\n" );
		return builder.toString();
	}

	@Override
	public int compareTo( Produto produtoComparar ) {
		if ( this.getPreco() > produtoComparar.getPreco() ) {
			return 1;
		} else if ( this.getPreco() < produtoComparar.getPreco() ) {
			return -1;
		}
		return 0;
	}

}
