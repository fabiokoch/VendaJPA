package beans;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: PasseValor
 *
 */
@Entity

public class PasseValor implements Serializable {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "PasseValorIdGen")
	@SequenceGenerator(name = "PasseValorIdGen", sequenceName = "PasseValorIdGen", allocationSize = 1)
	private Integer id_valor;
	@Temporal(TemporalType.DATE)
	@NotNull(message="A data inicial deve ser informada")
	private Date data_inicio_vigencia;
	@Temporal(TemporalType.DATE)
	private Date data_fim_vigencia;
	@NotNull(message="O valor deve ser informado")
	private Float valor;
	@ManyToOne
	@NotNull(message="O tipo deve ser informado")
	private TipoPasse tipo;
	private static final long serialVersionUID = 1L;

	public PasseValor() {
		super();
	}   
	public Integer getId_valor() {
		return this.id_valor;
	}

	public void setId_valor(Integer id_valor) {
		this.id_valor = id_valor;
	}   
	public Date getData_inicio_vigencia() {
		return this.data_inicio_vigencia;
	}

	public void setData_inicio_vigencia(Date data_inicio_vigencia) {
		this.data_inicio_vigencia = data_inicio_vigencia;
	}   
	public Date getData_fim_vigencia() {
		return this.data_fim_vigencia;
	}

	public void setData_fim_vigencia(Date data_fim_vigencia) {
		this.data_fim_vigencia = data_fim_vigencia;
	}   
	public Float getValor() {
		return this.valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}
	public PasseValor(TipoPasse tipo) {
		super();
		this.tipo = tipo;
	}
	public TipoPasse getTipo() {
		return tipo;
	}
	public void setTipo(TipoPasse tipo) {
		this.tipo = tipo;
	}
	
   
}
