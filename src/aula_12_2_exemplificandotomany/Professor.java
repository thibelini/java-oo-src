package aula_12_2_exemplificandotomany;

import java.math.BigDecimal;

public final class Professor extends Pessoa{

	private String especialidade;
	private String cpf;
	private BigDecimal valorHoraAula;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade( String especialidade ) {
		this.especialidade = especialidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf( String cpf ) {
		this.cpf = cpf;
	}

	public BigDecimal getValorHoraAula() {
		return valorHoraAula;
	}

	public void setValorHoraAula( BigDecimal valorHoraAula ) {
		this.valorHoraAula = valorHoraAula;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ( ( cpf == null ) ? 0 : cpf.hashCode() );
		return result;
	}

	@Override
	public boolean equals( Object obj ) {
		if ( this == obj ) {
			return true;
		}
		if ( !super.equals( obj ) ) {
			return false;
		}
		if ( !( obj instanceof Professor ) ) {
			return false;
		}
		Professor other = (Professor) obj;
		if ( cpf == null ) {
			if ( other.cpf != null ) {
				return false;
			}
		} else if ( !cpf.equals( other.cpf ) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append( "Professor [\n\t" );
		if ( especialidade != null ) {
			builder.append( "especialidade=" );
			builder.append( especialidade );
			builder.append( ", \n\t" );
		}
		if ( cpf != null ) {
			builder.append( "cpf=" );
			builder.append( cpf );
			builder.append( ", \n\t" );
		}
		if ( valorHoraAula != null ) {
			builder.append( "valorHoraAula=" );
			builder.append( valorHoraAula );
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
