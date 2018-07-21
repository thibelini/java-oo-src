package aula_05_6_praticando;

import java.time.LocalDateTime;

public class Cliente{
	Integer codigo;
	String nome;
	LocalDateTime dataCadastro;

	LocalDateTime retornarDataCadastro( Cliente cliente ) {
		return cliente.dataCadastro;
	}

	void exibirDados() {
		System.out.println( "Nome: " + this.nome );
		System.out.println( "Codigo: " + this.codigo );
		System.out.println( "Data do Cadastro: " + this.dataCadastro );
	}
}
