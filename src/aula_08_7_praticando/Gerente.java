package aula_08_7_praticando;

public class Gerente extends Funcionario{
	@Override
	public void setSalario( Double salario ) {
		super.setSalario( salario * 1.15 );
	}

	@Override
	public Double getSalario() {
		// TODO Auto-generated method stub
		return super.getSalario();
	}
}
