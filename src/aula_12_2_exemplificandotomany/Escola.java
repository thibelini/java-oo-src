package aula_12_2_exemplificandotomany;

import java.util.HashSet;

public final class Escola{

	private String cnpj;
	private Short quantidadeAlunos;
	private String nomeDiretor;
	/** Indica o relacionamento ToMany com Professor */
	private HashSet< Professor > professores;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj( String cnpj ) {
		this.cnpj = cnpj;
	}

	public Short getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos( Short quantidadeAlunos ) {
		this.quantidadeAlunos = quantidadeAlunos;
	}

	public String getNomeDiretor() {
		return nomeDiretor;
	}

	public void setNomeDiretor( String nomeDiretor ) {
		this.nomeDiretor = nomeDiretor;
	}

	public HashSet< Professor > getProfessores() {
		return professores;
	}

	public void setProfessores( HashSet< Professor > professores ) {
		this.professores = professores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( ( cnpj == null ) ? 0 : cnpj.hashCode() );
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
		if ( !( obj instanceof Escola ) ) {
			return false;
		}
		Escola other = (Escola) obj;
		if ( cnpj == null ) {
			if ( other.cnpj != null ) {
				return false;
			}
		} else if ( !cnpj.equals( other.cnpj ) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append( "Escola [\n\t" );
		if ( cnpj != null ) {
			builder.append( "cnpj=" );
			builder.append( cnpj );
			builder.append( ", \n\t" );
		}
		if ( quantidadeAlunos != null ) {
			builder.append( "quantidadeAlunos=" );
			builder.append( quantidadeAlunos );
			builder.append( ", \n\t" );
		}
		if ( nomeDiretor != null ) {
			builder.append( "nomeDiretor=" );
			builder.append( nomeDiretor );
			builder.append( ", \n\t" );
		}
		if ( professores != null ) {
			builder.append( "professores=" );
			builder.append( professores );
			builder.append( ", \n\t" );
		}
		if ( super.toString() != null ) {
			builder.append( "toString()=" );
			builder.append( super.toString() );
		}
		builder.append( "]\n" );
		return builder.toString();
	}

}
