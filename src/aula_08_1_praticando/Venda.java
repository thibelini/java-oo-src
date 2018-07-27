package aula_08_1_praticando;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 * Classe que representa
 *
 *
 * @author Thiago Belini <thibelini@gmail.com.br>
 * @since 26 de jul de 2018 19:25:08
 * @version 1.0
 */

public class Venda{

	private Long id;
	private LocalDateTime data;
	private BigDecimal total;
	private String numeroNota;
	private Cliente cliente;

	public Venda(){
		setCliente( new Cliente() );
	}

	public Venda( Long id ){
		setId( id );
	}

	public Long getId() {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData( LocalDateTime data ) {
		this.data = data;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal( BigDecimal total ) {
		this.total = total;
	}

	public String getNumeroNota() {
		return numeroNota;
	}

	public void setNumeroNota( String numeroNota ) {
		this.numeroNota = numeroNota;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente( Cliente cliente ) {
		this.cliente = cliente;
	}

	public String getDados() {
		StringBuilder texto = new StringBuilder();
		texto.append( "Id da Venda: " );
		texto.append( id );
		texto.append( " | Data: " );
		texto.append( data.format( DateTimeFormatter.ofPattern( "dd/MM/yyyy HH:mm:ss" ) ) );
		texto.append( " | Total: " );
		texto.append( total );
		texto.append( " | Numero da Nota: " );
		texto.append( numeroNota + "\n" );
		texto.append( cliente.getDados() );
		return texto.toString();
	}

}
