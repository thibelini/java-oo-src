package aula_12_2_exemplificandotomany;

public abstract class Pessoa{

	private long codigo;
	private String nome;
	private String endereco;

	public long getCodigo() {
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco( String endereco ) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( ( endereco == null ) ? 0 : endereco.hashCode() );
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
		if ( !( obj instanceof Pessoa ) ) {
			return false;
		}
		Pessoa other = (Pessoa) obj;
		if ( endereco == null ) {
			if ( other.endereco != null ) {
				return false;
			}
		} else if ( !endereco.equals( other.endereco ) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append( "Pessoa [\n\tcodigo=" );
		builder.append( codigo );
		builder.append( ", \n\t" );
		if ( nome != null ) {
			builder.append( "nome=" );
			builder.append( nome );
			builder.append( ", \n\t" );
		}
		if ( endereco != null ) {
			builder.append( "endereco=" );
			builder.append( endereco );
		}
		builder.append( "]\n" );
		return builder.toString();
	}

}
