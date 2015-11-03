package beans;

import beans.Movimento;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Movimento_pagamento
 *
 */
@Entity

public class Movimento_pagamento implements Serializable {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "MovtoPagtoIdGen")
	@SequenceGenerator(name = "MovtoPagtoIdGen", sequenceName = "MovtoPagtoIdGen", allocationSize = 1)
	private Integer id_movto_pagto;
	private String nrCheque;
	@NotNull
	private Float valor;
	@ManyToOne
	@NotNull
	private Movimento movimento;
	@ManyToOne
	private FormaPagamento forma;
	private static final long serialVersionUID = 1L;

	public Movimento_pagamento() {
		super();
	}   
	public Integer getId_movto_pagto() {
		return this.id_movto_pagto;
	}

	public void setId_movto_pagto(Integer id_movto_pagto) {
		this.id_movto_pagto = id_movto_pagto;
	}   
	public String getNrCheque() {
		return this.nrCheque;
	}

	public void setNrCheque(String nrCheque) {
		this.nrCheque = nrCheque;
	}   
	public Float getValor() {
		return this.valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}   
	public Movimento getMovimento() {
		return this.movimento;
	}

	public void setMovimento(Movimento movimento) {
		this.movimento = movimento;
	}
	public Movimento_pagamento(FormaPagamento forma) {
		super();
		this.forma = forma;
	}
	public FormaPagamento getForma() {
		return forma;
	}
	public void setForma(FormaPagamento forma) {
		this.forma = forma;
	}
	
   
}
