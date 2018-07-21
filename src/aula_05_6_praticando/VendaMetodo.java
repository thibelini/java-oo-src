package aula_05_6_praticando;

import java.math.BigDecimal;

public class VendaMetodo{

	void exibirTotal( BigDecimal total ) {
		System.out.println( "O Total da Venda é: " + total );
	}

	Integer retornarCodigoNovo( Integer codigoAtual ) {
		return codigoAtual = codigoAtual + 1;
	}

}
